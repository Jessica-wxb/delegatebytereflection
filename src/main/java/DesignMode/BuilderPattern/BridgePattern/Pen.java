package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName Pen
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:16
 * @Version 1.0
 **/
public abstract class Pen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(String name);
}
