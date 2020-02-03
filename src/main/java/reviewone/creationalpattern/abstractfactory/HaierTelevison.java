package reviewone.creationalpattern.abstractfactory;

/**
 * @ClassName HaierTelevison
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:06
 * @Version 1.0
 **/
public class HaierTelevison implements Television {
    @Override
    public void play() {
        System.out.println("海尔电视机正在播放中~~~");
    }
}
