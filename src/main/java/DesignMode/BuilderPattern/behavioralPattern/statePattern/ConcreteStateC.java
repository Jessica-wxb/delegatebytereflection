package DesignMode.BuilderPattern.behavioralPattern.statePattern;

/**
 * @ClassName ConcreteStateC
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 9:11
 * @Version 1.0
 **/
public class ConcreteStateC extends State {
    @Override
    void Handle(Context context) {
        context.setState(new ConcreteStateC());
        System.out.println("读书");
    }
}
