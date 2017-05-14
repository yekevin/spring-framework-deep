package me.springframework.context.event.anno;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

/**
 * @author Administrator
 * @description
 * @date 2017/5/14
 */
public class BlackListNotifier {
    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    //@EventListener({ContextStartedEvent.class, ContextRefreshedEvent.class})
    //@EventListener(condition = "#blEvent.test == 'foo'")
    @EventListener(BlackListEvent.class)
    @Async
    @Order(42)
    public void processBlackListEvent(BlackListEvent event) {
        System.out.println("Notify to" + notificationAddress + event.getAddress() + " " + event.getMessage());
    }
}
