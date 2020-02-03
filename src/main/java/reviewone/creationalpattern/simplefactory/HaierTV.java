package reviewone.creationalpattern.simplefactory;

/**
 * @ClassName HaierTV
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 13:16
 * @Version 1.0
 **/
public class HaierTV implements TV {
    @Override
    public void play() {
        System.out.println("海尔电视机播放中。。。。");
    }
}
