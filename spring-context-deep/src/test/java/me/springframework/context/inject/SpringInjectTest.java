package me.springframework.context.inject;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringInjectTest {

    @Test
    public void testConstructInjecet() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConstructInject.xml");
        SpringConstructService springConstructService = context.getBean(SpringConstructService.class);
        springConstructService.sayHello();
    }

    @Test
    public void testXmlSetterInject(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springSetterInject.xml");
        SpringSetterService springSetterService = context.getBean(SpringSetterService.class);
        springSetterService.sayHello();
    }

    @Test
    public void testAnnotationInject(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAnnotationInject.xml");
        SpringAnnotationService springAnnotationService = context.getBean(SpringAnnotationService.class);
        springAnnotationService.sayHello();
    }

    @Test
    public void testAutoWrite(){
//        AutowiredAnnotationBeanPostProcessor
    }
}
