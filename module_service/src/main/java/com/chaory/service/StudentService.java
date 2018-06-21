package com.chaory.service;

import com.chaory.Entitys.Student;

import java.util.List;
import java.util.Optional;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public interface StudentService {
    List<Student> list() throws ServiceException;
    Optional<Student> getStudent(String id) throws ServiceException;
    void addStudent(Student student) throws ServiceException;
    void add(String id,String name,String group) throws ServiceException;
    void updataStudent(Student student) throws ServiceException;
    void deleteStudent(Student student) throws ServiceException;

}
