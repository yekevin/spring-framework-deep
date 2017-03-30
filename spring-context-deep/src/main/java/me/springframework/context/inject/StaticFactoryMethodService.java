package me.springframework.context.inject;

/**
 * @author Kevin
 * @description 使用静态工厂方法实例化
 * @date 2017/3/30
 */
public class StaticFactoryMethodService {
    private static StaticFactoryMethodService service = new StaticFactoryMethodService();

    private StaticFactoryMethodService() {

    }

    public static StaticFactoryMethodService getInstance(int age,String name) {
        return service;
    }

    public boolean init() {
        return true;
    }
}
