package DesignMode.BuilderPattern.behavioralPattern.statePattern.stateOne;

/**
 * @ClassName ConcreteStateC
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 9:41
 * @Version 1.0
 **/
public class ConcreteStateC extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
        System.out.println("香香");
    }
}
