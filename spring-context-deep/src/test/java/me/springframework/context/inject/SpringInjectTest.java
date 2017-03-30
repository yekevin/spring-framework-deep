package me.springframework.context.inject;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringInjectTest {

    @Test
    public void testStaticFactoryMethod() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springStaticFactoryMethod.xml");
        StaticFactoryMethodService service = context.getBean(StaticFactoryMethodService.class);
        Assert.assertEquals(service.init(), true);
    }

    @Test
    public void testInstanceFactoryMethod(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springInstanceFactoryMethod.xml");
        ClientService service = context.getBean(ClientService.class);
        Assert.assertEquals(service.init(), true);
    }

    @Test
    public void testConstructInjecet() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConstructInject.xml");
        SpringConstructService springConstructService = context.getBean(SpringConstructService.class);
        springConstructService.sayHello();
    }

    @Test
    public void testSimpleTypeConstructInject() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springSimpleTypeConstructInject.xml");
        SimpleTypeConstructService simpleTypeConstructService = context.getBean(SimpleTypeConstructService.class);
        Assert.assertEquals(simpleTypeConstructService.getAge(), 28);
        Assert.assertEquals(simpleTypeConstructService.getName(), "Kevin");
    }

    @Test
    public void testXmlSetterInject() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springSetterInject.xml");
        SpringSetterService springSetterService = context.getBean(SpringSetterService.class);
        springSetterService.sayHello();
    }

    @Test
    public void testAnnotationInject() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAnnotationInject.xml");
        SpringAnnotationService springAnnotationService = context.getBean(SpringAnnotationService.class);
        springAnnotationService.sayHello();
    }

    @Test
    public void testCollectionInject(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springCollectionInject.xml");
        CollectionInjectService collectionInjectService = context.getBean(CollectionInjectService.class);
        System.out.println(collectionInjectService.getLists());
        System.out.println(collectionInjectService.getMaps());
        System.out.println(collectionInjectService.getProperties());
        System.out.println(collectionInjectService.getSets());
    }

    @Test
    public void testAutoWrite() {
//        AutowiredAnnotationBeanPostProcessor
    }
}
