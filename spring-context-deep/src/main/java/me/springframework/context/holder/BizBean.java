package me.springframework.context.holder;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
@Component
public class BizBean {

    public BizBean() {
        System.out.println("BizBean初始化");
    }

    public void sayHello(){
        System.out.println("调用BizBean SayHello!");
    }
}
