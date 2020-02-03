package DesignMode.BuilderPattern.behavioralPattern.strategyPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 11:08
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Strategy strategy1 = new ConcreteStrategyB();
        Strategy strategy2 = new ConcreteStrategyC();

        Context context = new Context();
        context.setStrategy(strategy);
        context.ContextInterface();

        Context context1 = new Context();
        context1.setStrategy(strategy1);
        context1.ContextInterface();

        Context context2 = new Context();
        context2.setStrategy(strategy2);
        context2.ContextInterface();



    }

}
