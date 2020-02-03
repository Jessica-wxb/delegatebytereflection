package DesignMode.BuilderPattern.behavioralPattern.statePattern.stateOne;

/**
 * @ClassName ConcreteStateB
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 9:39
 * @Version 1.0
 **/
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateC());
        System.out.println("静静");
    }
}
