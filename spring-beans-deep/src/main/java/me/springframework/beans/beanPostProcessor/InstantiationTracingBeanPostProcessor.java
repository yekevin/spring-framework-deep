package me.springframework.beans.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Kevin
 * @description
 * 实现了BeanPostProcessor接口的类是很特殊的，并且会被容器特殊对待
 * 所有BeanPostProcessor和它们直接引用的bean会在启动时实例化，且作为ApplicationContext启动的特殊部分。
 * 荐使用ApplicationContext自动检测BeanPostProcessor,也可以使用ConfigurableBeanFactory的addBeanPostProcessor方法编程式地注册。
 * 所有的BeanPostProcessor按顺序注册并应用到所有后来的bean上。
 * 编程式注册的BeanPostProcessor并不遵从Ordered接口的顺序，那是因为它们注册的顺序就是它们执行的顺序.
 * 编程式注册的BeanPostProcessor总是在通过自动检测注册的BeanPostProcessor之前执行。
 * @date 2017/3/31
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    public InstantiationTracingBeanPostProcessor() {
        System.out.println("construct InstantiationTracingBeanPostProcessor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization " + bean.toString());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization " + bean.toString());
        return bean;
    }
}
