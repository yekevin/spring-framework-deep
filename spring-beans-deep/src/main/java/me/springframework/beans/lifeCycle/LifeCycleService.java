package me.springframework.beans.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Kevin
 * @description
 * initialization 和 destroy
 * 三种方式
 * 1.实现InitializingBean和DisposableBean接口
 * 2.在bean的配置文件中指定init-method和destroy-method方法
 * 3.使用@PostConstruct和@PreDestroy注解
 * @date 2017/3/24
 */
public class LifeCycleService implements InitializingBean, DisposableBean {
    public LifeCycleService() {
        System.out.println("执行LifeCycleService构造方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行DisposableBean接口的destroy方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行InitializingBean接口的afterPropertiesSet方法");
    }
}
