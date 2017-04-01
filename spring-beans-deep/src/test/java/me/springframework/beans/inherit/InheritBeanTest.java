package me.springframework.beans.inherit;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kevin
 * @description
 * @date 2017/3/31
 */
public class InheritBeanTest {

    @Test
    public void testInheritBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanInherit.xml");
        ChildBean childBean = context.getBean(ChildBean.class);
        Assert.assertEquals(childBean.getName(), "override");
        Assert.assertEquals(childBean.getAge(), 28);
    }
}
