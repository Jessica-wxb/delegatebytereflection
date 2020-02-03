package reviewone.creationalpattern.factorymethod;

/**
 * @ClassName HaierTVFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 13:29
 * @Version 1.0
 **/
public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("海尔电视机工厂生产海尔电视机");
        return new HaierTV();
    }
}
