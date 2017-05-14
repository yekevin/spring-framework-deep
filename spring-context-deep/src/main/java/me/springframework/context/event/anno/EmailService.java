package me.springframework.context.event.anno;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

/**
 * @author Administrator
 * @description
 * @date 2017/5/14
 */
public class EmailService implements ApplicationEventPublisherAware {
    private List<String> blackList;
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public void sendEmail(String address,String message){
        if(blackList.contains(address)){
            ApplicationEvent applicationEvent = new BlackListEvent(this,address,message);
            applicationEventPublisher.publishEvent(applicationEvent);
            return;
        }
        // TODO send email
    }
}
