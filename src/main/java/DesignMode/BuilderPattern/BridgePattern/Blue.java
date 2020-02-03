package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName Bule
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:27
 * @Version 1.0
 **/
public class Blue implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"蓝色的"+name+".");
    }
}
