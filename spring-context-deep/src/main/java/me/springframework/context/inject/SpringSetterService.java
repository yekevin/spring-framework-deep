package me.springframework.context.inject;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringSetterService {

    private SpringDao springDao;

    public void setSpringDao(SpringDao springDao) {
        System.out.println("执行SpringSetterService setSpringDao方法");
        this.springDao = springDao;
    }

    public void sayHello() {
        System.out.println("执行SpringSetterService sayHello方法");
        springDao.sayHello();
    }
}
