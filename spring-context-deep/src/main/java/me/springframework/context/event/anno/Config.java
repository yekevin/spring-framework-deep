package me.springframework.context.event.anno;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @description
 * @date 2017/5/14
 */
@Configurable
public class Config {
    @Bean
    public BlackListNotifier blackListNotifier() {
        BlackListNotifier blackListNotifier = new BlackListNotifier();
        blackListNotifier.setNotificationAddress("notifier@gmail.com");
        return blackListNotifier;
    }

    @Bean
    public EmailService emailService() {
        List<String> list = new ArrayList<>();
        list.add("known.spammer@example.org");
        list.add("known.hacker@example.org");
        list.add("john.doe@example.org");
        EmailService emailService = new EmailService();
        emailService.setBlackList(list);
        return emailService;
    }
}
