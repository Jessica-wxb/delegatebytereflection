package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandOne;

/**
 * @ClassName TVOpenCommand
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 15:59
 * @Version 1.0
 **/
public class TVOpenCommand implements AbstractCommand {
    private Television tv;

    public TVOpenCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.open();
    }
}
