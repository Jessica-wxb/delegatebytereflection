package DesignMode.BuilderPattern.FactoryMethodPattern;

/**
 * @ClassName HisenseTV
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 10:08
 * @Version 1.0
 **/
public class HisenseTV implements TV {


    @Override
    public void paly() {
        System.out.println("海信电视机正在播放~");
    }
}
