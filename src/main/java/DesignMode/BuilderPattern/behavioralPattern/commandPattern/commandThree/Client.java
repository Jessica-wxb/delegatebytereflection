package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandThree;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 9:19
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractCommand openCommand, changeCommand, closeCommand;

        openCommand = new TVOpenCommand();
        changeCommand = new TVChanageCommand();
        closeCommand = new TVCloseCommand();

        openCommand.execute();
        changeCommand.execute();
        closeCommand.execute();

    }
}
