package me.springframework.context.applicationContext;

import org.springframework.stereotype.Component;

/**
 * @author Kevin
 * @description
 * @date 2017/3/29
 */
@Component
public class ApplicationContextBizBean {

    public void sayHello() {
        System.out.println("Hello World!");
    }
}
