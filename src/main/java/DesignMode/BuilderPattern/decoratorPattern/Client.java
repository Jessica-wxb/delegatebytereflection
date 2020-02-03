package DesignMode.BuilderPattern.decoratorPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 8:55
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Transform camero;
        camero = new Car();
        camero.move();
        System.out.println("-----------");
        Robot bumblebee = new Robot(camero);
        bumblebee.say();
        bumblebee.move();


    }
}
