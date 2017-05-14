package me.springframework.context.event;

import org.springframework.context.ApplicationListener;

/**
 * @author Administrator
 * @description
 * @date 2017/5/14
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println("Notify to" + notificationAddress + event.getAddress() + " " + event.getMessage());
    }
}
