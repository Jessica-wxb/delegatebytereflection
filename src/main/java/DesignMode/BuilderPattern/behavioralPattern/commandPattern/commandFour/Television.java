package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandFour;

/**
 * @ClassName Television
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 9:31
 * @Version 1.0
 **/
public class Television {
    public void open() {
        System.out.println("打开电视");
    }

    public void close() {
        System.out.println("关闭电视机");

    }
    public void change() {
        System.out.println("更换频道");
    }
}
