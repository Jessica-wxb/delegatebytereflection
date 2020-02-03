package DesignMode.BuilderPattern.SimpleFactory;

/**
 * @ClassName HisenseTV
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 8:40
 * @Version 1.0
 **/
public class HisenseTV implements TV {

    @Override
    public void paly() {
        System.out.println("海信电视机播放中~");
    }
}
