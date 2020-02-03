package reviewone.creationalpattern.abstractfactory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:09
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {

        EFactory eFactory;
        Television television;
        AirConditioner airConditioner;
        eFactory = (EFactory) new HaierFacotry();
        television = new HaierTelevison();
        airConditioner = new HaierAirConditioner();
        television.play();
        airConditioner.changeTemperature();



    }
}
