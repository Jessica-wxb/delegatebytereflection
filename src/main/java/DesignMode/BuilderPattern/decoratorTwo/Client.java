package DesignMode.BuilderPattern.decoratorTwo;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:54
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Transform caramo;
        caramo = new Car();
        caramo.move();
        System.out.println("=========");

        AirPlant bumblebee = new AirPlant(caramo);
        bumblebee.fly();
        bumblebee.move();



    }
}
