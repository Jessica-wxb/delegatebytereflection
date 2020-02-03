package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName SmallPen
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:19
 * @Version 1.0
 **/
public class SmallPen extends Pen {

    @Override
    public void draw(String name) {
        String penType = "小号毛笔绘制";
        this.color.bePaint(penType,name);
    }
}
