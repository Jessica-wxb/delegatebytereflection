package DesignMode.BuilderPattern.behavioralPattern.test.observer;

import java.util.ArrayList;

/**
 * @ClassName MySubject
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 17:08
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

    public abstract void cry();

}
