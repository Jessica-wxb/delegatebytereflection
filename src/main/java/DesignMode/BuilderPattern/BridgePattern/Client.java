package DesignMode.BuilderPattern.BridgePattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 9:44
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen;
        color = (Color) new Red();
        pen = (Pen) new SmallPen();
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
