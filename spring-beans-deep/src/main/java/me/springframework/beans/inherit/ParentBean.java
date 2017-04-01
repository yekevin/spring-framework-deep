package me.springframework.beans.inherit;

/**
 * @author Kevin
 * @description
 * @date 2017/3/31
 */
public class ParentBean {
    protected String name;
    protected int age;

    public ParentBean() {
        System.out.println("construct parentBean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ParentBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
