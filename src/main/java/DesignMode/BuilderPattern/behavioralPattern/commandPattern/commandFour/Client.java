package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandFour;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 9:36
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractCommand openCommand, closeCommand, changeCommand;
        openCommand = new TVOpenCommand();
        closeCommand = new TVCloseCommand();
        changeCommand = new TVChangeCommand();

        Controller controller = new Controller(openCommand, changeCommand, closeCommand);

       controller.open();
        controller.change();
        controller.close();
    }
}
