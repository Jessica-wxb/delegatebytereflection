package DesignMode.BuilderPattern.AbstractFactory;

/**
 * @ClassName TCLTelevision
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/18 16:53
 * @Version 1.0
 **/
public class TCLTelevision implements Television {
    @Override
    public void paly() {
        System.out.println("TCL的电视机正在播放~~");
    }
}
