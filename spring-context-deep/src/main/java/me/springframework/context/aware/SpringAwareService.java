package me.springframework.context.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Kevin
 * @description
 * @date 2017/3/24
 */
@Component
public class SpringAwareService implements ApplicationContextAware,
        ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
        BeanNameAware, EnvironmentAware, ResourceLoaderAware {

    private String beanName;

    // 注入classloader用于加载class
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("执行setBeanClassLoader,ClassLoader Name = " + classLoader.getClass().getName());
    }

    // 注入容器顶层接口beanFactory,可从beanFactory中直接获取bean实例
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("执行setBeanFactory,setBeanFactory:: springAwareService bean singleton=" + beanFactory.isSingleton(beanName));
    }

    //注入的beanName即为SpringAwareService在BeanFactory配置中的名字（根据情况是id或者name）
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("执行setBeanName:: Bean Name defined in context=" + name);
    }

    //通过重写的接口方法，获取spring容器实例context，进而获取容器中相关bean资源
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("执行setApplicationContext:: Bean Definition Names="
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    // 应用事件发布将回调该方法
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("执行setApplicationEventPublisher");
    }

    // 当前运行环境信息
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("执行setEnvironment");
    }

    // 注入资源加载器
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource resource = resourceLoader.getResource("classpath:springAware.xml");
        System.out.println("执行setResourceLoader:: Resource File Name=" + resource.getFilename());
    }


}
