package me.springframework.beans.annotation;

import javax.annotation.Resource;

/**
 * @author Kevin
 * @description
 * @date 2017/4/1
 */
public class ServiceBean {


    private TargetBean targetBean;

    // @Required注解作用在方法上,配合配置文件使用,当目标bean为null将抛出异常
    // @Required
    // 可作用在字段与方法上,提供与@Required相同的能力
    // @Autowired(required = false)
    // JSR-330的@Inject注解可以替换下面例子中Spring的@Autowired注解
    // @Inject
    @Resource
    public void setTargetBean(TargetBean targetBean) {
        System.out.println("set target bean");
        this.targetBean = targetBean;
    }

    public boolean init() {
        if (targetBean == null) {
            return false;
        }
        return targetBean.init();
    }
}
