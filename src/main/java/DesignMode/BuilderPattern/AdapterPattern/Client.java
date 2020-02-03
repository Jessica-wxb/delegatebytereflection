package DesignMode.BuilderPattern.AdapterPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 17:20
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Robot robot = (Robot) new DogAdapter();
        robot.cry();
        robot.move();
    }
}
