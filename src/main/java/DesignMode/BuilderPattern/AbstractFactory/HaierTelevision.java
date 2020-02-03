package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName HaierTelevision
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 16:50
 * @Version 1.0
 **/
public class HaierTelevision implements Television {


    @Override
    public void paly() {
        System.out.println("海尔电视机正在播放~");
    }
}
