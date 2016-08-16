package com.xy.model;

/**
 * Created by helloworld on 2015/1/30.
 */
public class User2 {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User2{" + "id=" + id + ", name=" + name + '}';
    }

}
