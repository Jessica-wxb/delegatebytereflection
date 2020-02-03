package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName Green
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:26
 * @Version 1.0
 **/
public class Green implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"绿色的"+name+".");
    }
}
