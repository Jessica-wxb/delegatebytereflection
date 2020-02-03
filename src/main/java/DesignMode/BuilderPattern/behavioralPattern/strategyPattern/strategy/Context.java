package DesignMode.BuilderPattern.behavioralPattern.strategyPattern.strategy;

import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;

/**
 * @ClassName Context
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 11:27
 * @Version 1.0
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface() {
        strategy.ALgorighmInterface();
    }
}
