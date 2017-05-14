package me.springframework.context.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Administrator
 * @description
 * @date 2017/5/14
 */
public class BlackListEvent extends ApplicationEvent {

    private String address;
    private String message;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public BlackListEvent(Object source, String address, String message) {
        super(source);
        this.address = address;
        this.message = message;
    }
}
