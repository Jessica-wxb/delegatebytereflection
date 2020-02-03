package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName MiddlePen
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:22
 * @Version 1.0
 **/
public class MiddlePen extends Pen {


    @Override
    public void draw(String name) {
        String penType = "中号毛笔绘制";
        this.color.bePaint(penType,name);
    }
}
