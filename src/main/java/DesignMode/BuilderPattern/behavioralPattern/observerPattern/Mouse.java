package DesignMode.BuilderPattern.behavioralPattern.observerPattern;

/**
 * @ClassName Mouse
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 16:36
 * @Version 1.0
 **/
public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("老鼠努力逃跑！");
    }
}
