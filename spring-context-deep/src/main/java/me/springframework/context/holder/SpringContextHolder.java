package me.springframework.context.holder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
@Service
public class SpringContextHolder implements ApplicationContextAware, DisposableBean {

    private static ApplicationContext context = null;

    @Override
    public void destroy() throws Exception {
        context = null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.context = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return context;
    }
    /**
     * 从静态变量applicationContext中取得Bean, 自动转型为所赋值对象的类型.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        return (T) context.getBean(name);
    }

    /**
     * 从静态变量applicationContext中取得Bean, 自动转型为所赋值对象的类型.
     */
    public static <T> T getBean(Class<T> requiredType) {
        return context.getBean(requiredType);
    }
}
