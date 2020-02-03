package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandOne;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 15:53
 * @Version 1.0
 **/
public class Controller {
    private AbstractCommand openCommand,closeCommand, changeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }
    public void open() {

        openCommand.execute();
    }

    public void close() {
        closeCommand.execute();

    }
    public void changeCommand() {
        changeCommand.execute();
    }
}
