package me.springframework.context.inject;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringConstructService {
    private SpringDao springDao;

    public SpringConstructService(SpringDao springDao) {
        System.out.println("执行SpringConstructService 构造方法注入 SpringDao");
        this.springDao = springDao;
    }

    public void sayHello() {
        System.out.println("执行SpringConstructService SayHello方法");
        springDao.sayHello();
    }
}
