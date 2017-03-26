package me.springframework.beans.lifeCycle;

import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Administrator
 * @description
 * 延迟初始化bean有两种方式：
 * 1.在配置文件指定bean lazy-init=true
 * 2.
 * @date 2017/3/26
 */
@Lazy
public class LifeCycleLazyService {

    public LifeCycleLazyService() {
        System.out.println("执行LifeCycleLazyService构造方法");
    }

    @PostConstruct
    public void initPostConstruct() {
        System.out.println("执行LifeCycleLazyService-PostConstruct注解标注的方法");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("执行LifeCycleLazyService-preDestroy注解标注的方法");
    }
}
