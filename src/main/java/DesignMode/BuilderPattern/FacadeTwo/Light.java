package DesignMode.BuilderPattern.FacadeTwo;

/**
 * @ClassName Light
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 11:20
 * @Version 1.0
 **/
public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }
    public void on() {
        System.out.println(this.position+"打开灯");
    }
    public void off() {
        System.out.println(this.position+"关闭灯");
    }
}
