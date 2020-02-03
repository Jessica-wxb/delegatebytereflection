package reviewone.creationalpattern.abstractfactory;

/**
 * @ClassName TCLAirConditioner
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:08
 * @Version 1.0
 **/
public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度改变中~~~");
    }
}

