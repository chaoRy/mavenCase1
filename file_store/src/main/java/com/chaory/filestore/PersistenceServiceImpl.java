package com.chaory.filestore;

import com.chaory.Entitys.entity.Entity;
import com.chaory.service.PersistenceException;
import com.chaory.service.PersistenceService;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public class PersistenceServiceImpl  implements PersistenceService{
    private final Path dataPath =  Paths.get(".", "data");
    @Override
    public <T extends Entity> List<T> list(Class<T> type) throws PersistenceException {
        List<T> result= new ArrayList<>();
        try {
            DirectoryStream<Path>  directoryStream = Files.newDirectoryStream(getEntitiesPath(type),"*.bin");
            for(Path path:directoryStream){
                result.add((T) readEntity(path));
            }
        } catch (IOException e) {
            throw  new PersistenceException(e);
        }
        return result;
    }

    @Override
    public <T extends Entity> Optional<T> get(Class<T> type, String id) throws PersistenceException {
        return Optional.empty();
    }

    @Override
    public void save(Entity entity) throws PersistenceException {
        saveEntity(entity);

    }

    @Override
    public <T extends Entity> void delete(Class<T> type, String id) throws PersistenceException {

    }

    /**
     * 获得多个实体路径，实体的类名做为目录的名称
     *
     * @param type
     * @return
     */
    private Path getEntitiesPath(Class<?> type){
        return dataPath.resolve(type.getSimpleName());
    }

    /**
     * 获得每个实体单一的路径
     * @param type
     * @param id
     * @return
     */
    private Path getEntityPath(Class<?> type,String id){
        return getEntitiesPath(type).resolve(String.format("%s.bin", id));
    }

    /**
     * 读取路径下的实体
     * @param path
     * @param <T>
     * @return
     */
    private <T extends Entity> T readEntity(Path path) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(Files.newInputStream(path));
            return (T) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 保存实体
     * @param entity
     */
    private void saveEntity(Entity entity){
        ObjectOutputStream objectOutputStream = null;

        Path path =getEntityPath(entity.getClass(),entity.getId());
        try{
            objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path));
            objectOutputStream.writeObject(entity);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除实体
     * @param type
     * @param id
     */
    private void deleteEntity(Class <?> type,String id){
        try {
            Files.deleteIfExists(getEntityPath(type,id));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
