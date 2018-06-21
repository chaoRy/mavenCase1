package com.chaory.Entitys.entity;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public abstract class nameEntity extends Entity {
    protected String name;

    public nameEntity() {
    }

    public nameEntity(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "nameEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
