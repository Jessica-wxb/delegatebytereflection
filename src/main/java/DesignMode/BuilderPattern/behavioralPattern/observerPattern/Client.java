package DesignMode.BuilderPattern.behavioralPattern.observerPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 16:37
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        MySubject subject = new Cat();

        MyObserver obs1, obs2, obs3;
        obs1 = new Mouse();
        obs2 = new Mouse();
        obs3 = new Dog();

        subject.attach(obs1);
        subject.attach(obs2);
        subject.attach(obs3);

        subject.cry();
    }
}
