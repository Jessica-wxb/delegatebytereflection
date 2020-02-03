package reviewone.creationalpattern.factorymethod;

/**
 * @ClassName Hisense
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 13:28
 * @Version 1.0
 **/
public class Hisense implements TV {
    @Override
    public void play() {
        System.out.println("海信电视机正在播放中。。。");
    }
}
