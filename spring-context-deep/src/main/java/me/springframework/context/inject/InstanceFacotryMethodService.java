package me.springframework.context.inject;

/**
 * @author Kevin
 * @description 使用实例的工厂方法实例化(非静态)
 * @date 2017/3/30
 */
public class InstanceFacotryMethodService {

    private static ClientService clientService = new ClientService();

    private InstanceFacotryMethodService() {
    }

    public ClientService getClientServiceInstance() {
        return clientService;
    }

}
