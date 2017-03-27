package me.springframework.context.context;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kevin
 * @description
 * @date 2017/3/27
 */
public class ApplicationContextTest {

    @Test
    public void testClassPathXmlApplicationContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("");
    }
}
