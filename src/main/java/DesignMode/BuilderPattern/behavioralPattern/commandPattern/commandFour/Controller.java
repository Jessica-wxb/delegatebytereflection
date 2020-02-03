package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandFour;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 9:30
 * @Version 1.0
 **/
public class Controller {
    private AbstractCommand openCommand,changeCommand, closeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand changeCommand, AbstractCommand closeCommand) {
        this.openCommand = openCommand;
        this.changeCommand = changeCommand;
        this.closeCommand = closeCommand;
    }
    public void open() {
        openCommand.execute();
    }
    public void close() {
        closeCommand.execute();
    }
    public void change() {
        changeCommand.execute();
    }
}
