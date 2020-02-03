package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName Red
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:25
 * @Version 1.0
 **/
public class Red implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"红色的"+name+".");
    }
}
