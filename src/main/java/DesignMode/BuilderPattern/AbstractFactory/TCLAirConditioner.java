package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName TCLAirConditioner
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 16:57
 * @Version 1.0
 **/
public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("调TCL空调的温度");
    }
}
