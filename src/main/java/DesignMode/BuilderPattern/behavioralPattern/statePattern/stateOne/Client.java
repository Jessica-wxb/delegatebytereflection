package DesignMode.BuilderPattern.behavioralPattern.statePattern.stateOne;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 9:36
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateC());
        context.Request();
    }
}
