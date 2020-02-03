package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandOne;

/**
 * @ClassName TVChangeCommand
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 16:03
 * @Version 1.0
 **/
public class TVChangeCommand implements AbstractCommand {
    private Television tv;

    public TVChangeCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
