package me.springframework.context.inject;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringAnnotationService {

    @Autowired
    private SpringDao springDao;

    public void sayHello() {
        System.out.println("执行SpringAnnotationService SayHello方法");
        springDao.sayHello();
    }
}
