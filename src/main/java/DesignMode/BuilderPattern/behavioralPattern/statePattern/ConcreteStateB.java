package DesignMode.BuilderPattern.behavioralPattern.statePattern;

/**
 * @ClassName ConcreteStateB
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 9:11
 * @Version 1.0
 **/
public class ConcreteStateB extends State {
    @Override
    void Handle(Context context) {
        context.setState(new ConcreteStateB());
        System.out.println("喝水");
    }
}
