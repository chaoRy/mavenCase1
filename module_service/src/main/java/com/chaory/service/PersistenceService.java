package com.chaory.service;




import com.chaory.Entitys.entity.Entity;


import java.util.List;
import java.util.Optional;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public interface PersistenceService {
    /**
     * 列出方法
     * @param type
     * @param <T>
     * @return
     * @throws PersistenceException
     */
    <T extends Entity>List<T> list(Class<T> type) throws PersistenceException;

    /**
     * 获取方法
     * @param type
     * @param id
     * @param <T>
     * @return
     * @throws PersistenceException
     */
   <T extends Entity> Optional<T> get(Class<T> type,String id) throws  PersistenceException;

    /**
     * 保存一个实体
     * @param entity
     * @throws PersistenceException
     */
    void save(Entity entity) throws PersistenceException;

    /**
     * 用于删除一个实体
     * @param type
     * @param id
     * @param <T>
     * @throws PersistenceException
     */
    <T extends Entity> void delete(Class<T> type,String id) throws PersistenceException;

}
