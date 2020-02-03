package DesignMode.BuilderPattern.behavioralPattern.statePattern;

/**
 * @ClassName ConcreteStateA
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 9:03
 * @Version 1.0
 **/
public class ConcreteStateA extends State {
    @Override
    void Handle(Context context) {
        context.setState(new ConcreteStateA());
        System.out.println("吃饭");
    }
}
