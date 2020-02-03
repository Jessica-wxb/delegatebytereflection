package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandTwo;

/**
 * @ClassName TVOpenCommand
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 8:42
 * @Version 1.0
 **/
public class TVOpenCommand  implements AbstractCommand{
    private Television television;
    @Override
    public void execute() {
        television.open();
    }

    public TVOpenCommand() {
        television = new Television();
    }
}
