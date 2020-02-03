package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandFour;

/**
 * @ClassName TVCloseCommand
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 9:30
 * @Version 1.0
 **/
public class TVCloseCommand implements AbstractCommand {
    private Television television;
    @Override
    public void execute() {
        television.close();
    }

    public TVCloseCommand() {
        television = new Television();
    }

}
