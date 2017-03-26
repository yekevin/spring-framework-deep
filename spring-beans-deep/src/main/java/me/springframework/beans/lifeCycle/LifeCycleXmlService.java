package me.springframework.beans.lifeCycle;

/**
 * @author Kevin
 * @description
 * @date 2017/3/24
 */
public class LifeCycleXmlService {

    public LifeCycleXmlService() {
        System.out.println("执行LifeCycleXmlService构造方法");
    }

    private void initMethod(){
        System.out.println("执行LifeCycleXmlService-initMethod");
    }

    public void destoryMethod(){
        System.out.println("执行LifeCycleXmlService-destoryMethod");
    }
}
