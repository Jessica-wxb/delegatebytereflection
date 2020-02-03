package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName HaierFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 16:59
 * @Version 1.0
 **/
public class HaierFactory implements Factory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
