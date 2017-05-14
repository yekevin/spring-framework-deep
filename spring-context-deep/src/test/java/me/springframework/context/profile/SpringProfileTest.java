package me.springframework.context.profile;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.PropertySource;

/**
 * @author Administrator
 * @description
 * @date 2017/5/14
 */
public class SpringProfileTest {

    @Test
    public void activeProfileWithAnnotation() {
        // -Dspring.profiles.active="profile1,profile2"
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("development");
        ctx.register(StandaloneDataConfig.class, JndiDataConfig.class, DefaultDataConfig.class);
        ctx.refresh();
    }

    @Test
    public void activeProfileWithXml() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springProfiles.xml");
        ctx.getEnvironment().setActiveProfiles("development");
        ctx.refresh();

//        System.out.println(ctx.getEnvironment().getProperty("spring.common"));
    }
}
