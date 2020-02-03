package DesignMode.BuilderPattern.behavioralPattern.observerPattern;

import java.util.ArrayList;

/**
 * @ClassName MySubject
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 16:29
 * @Version 1.0
 **/
public abstract class MySubject {
    protected ArrayList observers = new ArrayList();
    public void attach(MyObserver observer) {
        observers.add(observer);
    }
    public void detach(MyObserver observer) {
        observers.remove(observer);


    }

    // 抽象通知方法
    public abstract void cry();

}
