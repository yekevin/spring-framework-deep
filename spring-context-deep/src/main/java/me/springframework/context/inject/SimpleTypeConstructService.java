package me.springframework.context.inject;

import java.beans.ConstructorProperties;

/**
 * @author Kevin
 * @description
 * @date 2017/3/30
 */
public class SimpleTypeConstructService {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // 注解@ConstructorProperties显式地指定参数的名字
    @ConstructorProperties({"age", "name"})
    public SimpleTypeConstructService(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleTypeConstructService{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
