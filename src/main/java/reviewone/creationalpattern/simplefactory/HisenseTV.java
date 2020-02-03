package reviewone.creationalpattern.simplefactory;

/**
 * @ClassName HisenseTV
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 13:17
 * @Version 1.0
 **/
public class HisenseTV implements TV {
    @Override
    public void play() {
        System.out.println("海信电视机播放中。。。");
    }
}
