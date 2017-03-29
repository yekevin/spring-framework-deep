package me.springframework.context.context;

import me.springframework.context.applicationContext.ApplicationContextBizBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Kevin
 * @description
 * @date 2017/3/27
 */
public class ApplicationContextTest {

    @Test
    public void testClassPathXmlApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springApplicationContext.xml");
        ApplicationContextBizBean bizBean = context.getBean(ApplicationContextBizBean.class);
        bizBean.sayHello();

        context = new ClassPathXmlApplicationContext("file:src/main/resources/springApplicationContext.xml");
        bizBean = context.getBean(ApplicationContextBizBean.class);
        bizBean.sayHello();
    }

    @Test
    public void testFileSystemApplicationContext() {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/springApplicationContext.xml");
        ApplicationContextBizBean bizBean = context.getBean(ApplicationContextBizBean.class);
        bizBean.sayHello();

        context = new FileSystemXmlApplicationContext("classpath:springApplicationContext.xml");
        bizBean = context.getBean(ApplicationContextBizBean.class);
        bizBean.sayHello();
    }
}
