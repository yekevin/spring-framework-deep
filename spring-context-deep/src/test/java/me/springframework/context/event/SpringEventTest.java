package me.springframework.context.event;

import me.springframework.context.event.anno.Config;
import org.junit.Test;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.EnumMap;

/**
 * @author Administrator
 * @description
 * @date 2017/3/26
 */
public class SpringEventTest {

    @Test
    public void blackListEventTest() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springEvent.xml");
        EmailService emailService = ctx.getBean(EmailService.class);
        emailService.sendEmail("kevin@gmail.com","HELLO");
        emailService.sendEmail("known.spammer@example.org","HELLO");
    }

    @Test
    public void blackListAnnoEventTest(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        me.springframework.context.event.anno.EmailService emailService = ctx.getBean(me.springframework.context.event.anno.EmailService.class);
        emailService.sendEmail("kevin@gmail.com","HELLO");
        emailService.sendEmail("known.spammer@example.org","HELLO");
    }
}
