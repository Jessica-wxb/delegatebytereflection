package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 16:39
 * @Version 1.0
 **/
public interface Factory {
    public Television produceTelevision();

    public AirConditioner produceAirConditioner();
}
