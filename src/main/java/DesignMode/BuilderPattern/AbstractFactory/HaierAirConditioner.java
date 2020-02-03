package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName HaierAirConditioner
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 16:56
 * @Version 1.0
 **/
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("更改海尔空调的温度");
    }
}
