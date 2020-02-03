package DesignMode.BuilderPattern.behavioralPattern.strategyPattern;

/**
 * @ClassName Context
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 11:02
 * @Version 1.0
 **/
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void ContextInterface() {
        strategy.AlgorithmInterface();
    }
}
