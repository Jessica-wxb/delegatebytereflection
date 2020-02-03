package DesignMode.BuilderPattern.behavioralPattern.commandPattern.commandOne;

/**
 * @ClassName Television
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 15:55
 * @Version 1.0
 **/
public class Television {
    public void open() {
        System.out.println("打开电视机！");
    }
    public void close() {
        System.out.println("关闭电视机！");
    }
    public void changeChannel() {
        System.out.println("更换电视频道！");
    }
}
