package me.springframework.beans.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Kevin
 * @description
 * @date 2017/3/24
 */
public class LifeCycleAnnotationService {

    public LifeCycleAnnotationService() {
        System.out.println("执行LifeCycleAnnotationService构造方法");
    }

    @PostConstruct
    public void initPostConstruct() {
        System.out.println("执行LifeCycleAnnotationService-PostConstruct注解标注的方法");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("执行LifeCycleAnnotationService-preDestroy注解标注的方法");
    }
}
