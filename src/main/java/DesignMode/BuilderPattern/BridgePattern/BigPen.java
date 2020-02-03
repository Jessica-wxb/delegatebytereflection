package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName BigPen
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:22
 * @Version 1.0
 **/
public class BigPen extends Pen {

    @Override
    public void draw(String name) {
        String penType = "大号毛笔绘制";
        this.color.bePaint(penType,name);
    }
}
