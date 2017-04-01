package me.springframework.beans.factoryBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Kevin
 * @description User对象的工厂类
 * @date 2017/4/1
 */
public class UserFactoryBean implements FactoryBean<User>, InitializingBean, DisposableBean {

    private User user;

    @Override
    public User getObject() throws Exception {
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return user == null ? User.class : user.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void destroy() throws Exception {
        user = null;
        System.out.println("Destory UserFactoryBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        user = new User();
        user.setName("Kevin");
        user.setAge(28);
    }
}
