package me.springframework.beans.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kevin
 * @description
 * @date 2017/4/1
 */
public class AnnotationTest {

    @Test
    public void testBeanPostProcessorAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanPostProcessorAnnotation.xml");
        ServiceBean serviceBean = context.getBean(ServiceBean.class);
        Assert.assertEquals(serviceBean.init(), true);
    }
}
