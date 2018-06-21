package com.chaory.Entitys.entity;

/**
 * Created by Chao-RY on 2018/6/20.
 */
public  abstract class Entity {
    protected String id;

    public Entity() {
    }

    public Entity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id='" + id + '\'' +
                '}';
    }
}
