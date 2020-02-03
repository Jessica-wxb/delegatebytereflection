package DesignMode.BuilderPattern.AdapterPattern;

/**
 * @ClassName DogAdapter
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 17:16
 * @Version 1.0
 **/
public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        System.out.println("机器人模仿：");
        super.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模仿：");
        super.run();
    }
}
