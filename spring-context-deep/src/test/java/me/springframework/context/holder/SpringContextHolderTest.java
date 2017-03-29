package me.springframework.context.holder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringContextHolderTest {

    private ClassPathXmlApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("springContextHolder.xml");
        context.start();
    }

    @After
    public void after() {
        context.destroy();
    }

    @Test
    public void testContextHolder() {
        BizBean bizBean = SpringContextHolder.getBean(BizBean.class);
        bizBean.sayHello();
    }
}
