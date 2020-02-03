package DesignMode.BuilderPattern.behavioralPattern.test.observer;

/**
 * @ClassName Mouse
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 17:12
 * @Version 1.0
 **/
public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("老鼠逃跑了");
    }
}
