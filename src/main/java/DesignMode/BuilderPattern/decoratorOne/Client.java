package DesignMode.BuilderPattern.decoratorOne;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:20
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Transform camaro;
        camaro = new Car();
        camaro.move();
        System.out.println("--------------");

        Robot bumblebee = new Robot(camaro);
        bumblebee.say();
        bumblebee.move();
    }
}
