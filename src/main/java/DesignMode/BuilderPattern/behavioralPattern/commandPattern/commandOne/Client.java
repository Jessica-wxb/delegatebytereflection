package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandOne;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 16:07
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractCommand openCommand, closeCommand, changeCommand;

        openCommand = new TVOpenCommand();
        closeCommand = new TVCloseCommand();
        changeCommand = new TVChangeCommand();

        Controller controller = new Controller(openCommand, closeCommand, changeCommand);
        controller.open();
        controller.changeCommand();
        controller.close();
    }
}
