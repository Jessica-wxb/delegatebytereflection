package reviewone.creationalpattern.abstractfactory;

/**
 * @ClassName TCLFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:17
 * @Version 1.0
 **/
public class TCLFactory implements EFactory {
    @Override
    public AirConditioner produceAirConditioner() {
        return new TCLAirConditioner();
    }

    @Override
    public Television produceTelevison() {
        return new TCLTelevision();
    }
}
