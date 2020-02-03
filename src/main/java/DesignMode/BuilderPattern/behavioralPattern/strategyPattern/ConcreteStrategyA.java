package DesignMode.BuilderPattern.behavioralPattern.strategyPattern;

/**
 * @ClassName ConcreteStrategyA
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 11:02
 * @Version 1.0
 **/
public class ConcreteStrategyA  implements Strategy{
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法S的实现");
    }
}
