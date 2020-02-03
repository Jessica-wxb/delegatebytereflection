package DesignMode.BuilderPattern.FacadePattern;

/**
 * @ClassName Light
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 10:50
 * @Version 1.0
 **/
public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }
    public void on() {
        System.out.println(this.position+"灯打开！");

    }

    public void off() {
        System.out.println(this.position+"灯关闭");
    }
}
