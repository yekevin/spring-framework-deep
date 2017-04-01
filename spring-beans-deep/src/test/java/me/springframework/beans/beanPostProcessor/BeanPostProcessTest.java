package me.springframework.beans.beanPostProcessor;

import me.springframework.beans.inherit.ParentBean;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Kevin
 * @description
 * @date 2017/3/31
 */
public class BeanPostProcessTest {

    @Test
    public void testInstantiationBeanPostProcessor() {
        // 编程试将beanPostProcessor注册
        ClassPathResource resource = new ClassPathResource("beanPostProcessor.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.addBeanPostProcessor(new InstantiationTracingBeanPostProcessor());
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        factory.getBean(ParentBean.class);

        // 使用ApplicationContext自动检测 将processor bean由spring管理
//        ApplicationContext context = new ClassPathXmlApplicationContext("beanPostProcessor.xml");
    }
}
