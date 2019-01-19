package com.example.spring.model;

/**
 * Created by Administrator on 2019/1/13/013.
 */
public class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }

    public Color() {
    }
}
