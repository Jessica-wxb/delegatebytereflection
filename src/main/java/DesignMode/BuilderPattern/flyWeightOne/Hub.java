package DesignMode.BuilderPattern.flyWeightOne;

/**
 * @ClassName Hub
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 15:46
 * @Version 1.0
 **/
public class Hub implements NetworkDevice {
    private String type;
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by Hub,type is"+this.type);

    }

    public Hub(String type) {
        this.type = type;
    }
}
