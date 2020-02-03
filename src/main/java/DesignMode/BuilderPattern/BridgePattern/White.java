package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName White
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:38
 * @Version 1.0
 **/
public class White implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"白色的"+name+".");
    }
}
