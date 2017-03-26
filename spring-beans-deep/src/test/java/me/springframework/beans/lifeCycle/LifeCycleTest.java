package me.springframework.beans.lifeCycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kevin
 * @description
 * @date 2017/3/24
 */
public class LifeCycleTest {

    @Test
    public void testBeanLifeCyle() {
        System.out.println("spring容器初始化");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lifeCycle.xml");
        context.start();
        System.out.println("spring容器初始化完毕");
        LifeCycleLazyService lifeCycleLazyService = context.getBean(LifeCycleLazyService.class);
        System.out.println("获取bean信息：" + lifeCycleLazyService.getClass().getName());
        System.out.println("关闭spring容器");
        context.close();
    }
}
