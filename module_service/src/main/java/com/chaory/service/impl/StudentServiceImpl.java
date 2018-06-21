package com.chaory.service.impl;


import com.chaory.Entitys.Student;
import com.chaory.service.PersistenceException;
import com.chaory.service.PersistenceService;
import com.chaory.service.ServiceException;
import com.chaory.service.StudentService;

import java.util.List;
import java.util.Optional;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public class StudentServiceImpl implements StudentService{
    private PersistenceService persistenceService= PersistenceServiceLoader.persistenceService;


    @Override
    public List<Student> list() throws ServiceException {

        try {
            return persistenceService.list(Student.class);
        } catch (PersistenceException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public Optional<Student> getStudent(String id) throws ServiceException {
        try {
            return persistenceService.get(Student.class,id);
        } catch (PersistenceException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void addStudent(Student student) throws ServiceException {
        try {
            persistenceService.save(student);
        } catch (PersistenceException e) {
            throw new ServiceException(e);
        }
    }


    @Override
    public void updataStudent(Student student) throws ServiceException {
        try {
            persistenceService.save(student);
        } catch (PersistenceException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void deleteStudent(Student student) throws ServiceException {
        try {
            persistenceService.delete(Student.class,student.getId());
        } catch (PersistenceException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public void add(String id, String name, String group) throws ServiceException {
        addStudent(new Student(id,name,group));
    }


}
