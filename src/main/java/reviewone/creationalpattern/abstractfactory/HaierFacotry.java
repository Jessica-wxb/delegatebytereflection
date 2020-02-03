package reviewone.creationalpattern.abstractfactory;

public class HaierFacotry  implements EFactory{
    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }

    @Override
    public Television produceTelevison() {
        return new HaierTelevison();
    }
}
