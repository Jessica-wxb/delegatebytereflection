package DesignMode.BuilderPattern.behavioralPattern.test.observer;

/**
 * @ClassName Doe
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 17:11
 * @Version 1.0
 **/
public class Dog implements MyObserver {
    @Override
    public void response() {
        System.out.println("狗跟着叫");
    }
}
