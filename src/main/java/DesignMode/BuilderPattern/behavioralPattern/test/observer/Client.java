package DesignMode.BuilderPattern.behavioralPattern.test.observer;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 17:08
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        MySubject subject = new Cat();
        MyObserver ob1, ob2, ob3;

        ob1 = new Mouse();
        ob2 = new Mouse();
        ob3 = new Dog();
        subject.attach(ob1);
        subject.attach(ob2);
        subject.attach(ob3);
        subject.cry();
    }
}
