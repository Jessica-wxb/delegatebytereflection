package DesignMode.BuilderPattern.behavioralPattern.strategyPattern;

/**
 * @ClassName ConcreteStrategyB
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 11:03
 * @Version 1.0
 **/
public class ConcreteStrategyB implements Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B的实现");
    }
}
