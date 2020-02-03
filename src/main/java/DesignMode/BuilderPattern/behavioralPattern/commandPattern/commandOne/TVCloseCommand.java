package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandOne;

/**
 * @ClassName TVCloseCommand
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 16:02
 * @Version 1.0
 **/
public class TVCloseCommand implements AbstractCommand {
    private Television tv;

    public TVCloseCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
