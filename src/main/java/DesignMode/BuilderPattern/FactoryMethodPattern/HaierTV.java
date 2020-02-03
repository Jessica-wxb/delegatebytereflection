package DesignMode.BuilderPattern.FactoryMethodPattern;

/**
 * @ClassName HaierTV
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 10:07
 * @Version 1.0
 **/
public class HaierTV implements TV{

    @Override
    public void paly() {
        System.out.println("海尔电视机播放中~");
    }
}
