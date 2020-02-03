package reviewone.creationalpattern.abstractfactory;

/**
 * @ClassName HaierAirConditioner
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:09
 * @Version 1.0
 **/
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调正在改变温度中~~~");
    }
}
