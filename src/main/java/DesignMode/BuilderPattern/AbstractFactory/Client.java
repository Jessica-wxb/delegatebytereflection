package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 17:52
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        HaierFactory haierFactory = new HaierFactory();
        HaierAirConditioner haierAirConditioner = new HaierAirConditioner();
        HaierTelevision haierTelevision = new HaierTelevision();
        haierAirConditioner.changeTemperature();
        haierTelevision.paly();
        TCLAirConditioner tclAirConditioner = new TCLAirConditioner();
        tclAirConditioner.changeTemperature();
        TCLTelevision tclTelevision = new TCLTelevision();
        tclTelevision.paly();

    }
}
