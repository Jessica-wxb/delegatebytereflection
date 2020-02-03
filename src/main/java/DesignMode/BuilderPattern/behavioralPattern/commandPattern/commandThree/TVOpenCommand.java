package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandThree;

/**
 * @ClassName TVOpenCommand
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 9:18
 * @Version 1.0
 **/
public class TVOpenCommand implements AbstractCommand {
    private Television television;

    public TVOpenCommand() {
        television = new Television();
    }

    @Override
    public void execute() {
        television.close();
    }
}
