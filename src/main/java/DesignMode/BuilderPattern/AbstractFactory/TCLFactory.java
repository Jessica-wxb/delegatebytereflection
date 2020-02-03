package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName TCLFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 17:00
 * @Version 1.0
 **/
public class TCLFactory implements Factory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TCLAirConditioner();
    }
}
