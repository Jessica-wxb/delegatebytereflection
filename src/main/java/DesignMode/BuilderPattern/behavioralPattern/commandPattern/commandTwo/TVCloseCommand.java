package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandTwo;

/**
 * @ClassName TVCloseCommand
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 8:43
 * @Version 1.0
 **/
public class TVCloseCommand implements AbstractCommand {
    private Television television;

    public TVCloseCommand() {
        television=new Television();
    }

    @Override
    public void execute() {
        television.close();



    }
}
