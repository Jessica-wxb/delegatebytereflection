package DesignMode.BuilderPattern.behavioralPattern.strategyPattern.strategy;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 11:18
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        /*Strategy strategy = new ConcreteStrategyA();
        Context context = new Context();
        context.setStrategy(strategy);
        context.setStrategy(strategy);
        context.ContextInterface();

        Strategy strategy1 = new ConcreteStrategyB();
        Context context1 = new Context();
        context1.setStrategy(strategy1);
        context1.ContextInterface();

        Strategy strategy2 = new ConcreteStrategyB();
        Context context2 = new Context();
        context2.setStrategy(strategy2);
        context2.ContextInterface();*/
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
           context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
           context = new Context(new ConcreteStrategyC());
        context.ContextInterface();



    }
}
