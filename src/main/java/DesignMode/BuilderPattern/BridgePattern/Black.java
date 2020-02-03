package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName Black
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:39
 * @Version 1.0
 **/
public class Black implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"黑色的"+name+".");
    }
}
