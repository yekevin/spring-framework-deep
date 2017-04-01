package me.springframework.beans.factoryBean;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kevin
 * @description
 * @date 2017/4/1
 */
public class FactoryBeanTest {

    @Test
    public void testFactoryBean() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");
        UserFactoryBean userFactoryBean = context.getBean(UserFactoryBean.class);
        Assert.assertEquals(userFactoryBean.getObject().getName(), "Kevin");
        Assert.assertEquals(userFactoryBean.getObject().getAge(), 28);
    }
}
