package me.springframework.context.aware;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringAwareServiceTest {

    @Test
    public void testAwareInterface() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAware.xml");
        context.start();
    }
}
