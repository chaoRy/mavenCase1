package com.chaory.Entitys;

import com.chaory.Entitys.entity.nameEntity;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public class Student extends nameEntity {
    private String group;


    public Student() {

    }

    public Student(String id, String name, String group) {
        super(id, name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                '}';
    }
}
