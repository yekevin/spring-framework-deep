package me.springframework.beans.beanFacotyPostProcessor;

import me.springframework.beans.beanFactoryPostProcessor.BeanConfig;
import me.springframework.beans.beanFactoryPostProcessor.DefaultService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kevin
 * @description
 * @date 2017/4/1
 */
public class BeanFactoryPostProcessorTest {

    @Test
    public void testPropertyPlaceholderConfigure() {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertyPlaceHolder.xml");
        BeanConfig config = context.getBean(BeanConfig.class);
        Assert.assertEquals(config.getName(), "Kevin");
        Assert.assertEquals(config.getAge(), 28);

        DefaultService defaultService = context.getBean(DefaultService.class);
        Assert.assertNotEquals(defaultService, null);
    }

    @Test
    public void testPropertyOverrideConfigure(){
        ApplicationContext context = new ClassPathXmlApplicationContext("propertyOverride.xml");
        BeanConfig config = context.getBean(BeanConfig.class);
        Assert.assertEquals(config.getName(), "Kevin");
        Assert.assertEquals(config.getAge(), 28);
    }
}
