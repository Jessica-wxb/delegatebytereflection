package reviewone.creationalpattern.abstractfactory;

/**
 * @ClassName TCLTelevision
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:07
 * @Version 1.0
 **/
public class TCLTelevision implements Television {
    @Override
    public void play() {
        System.out.println("TCL电视机正在播放中~~·");
    }
}
