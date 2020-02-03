package DesignMode.BuilderPattern.flyWeightOne;

/**
 * @ClassName Switch
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 15:46
 * @Version 1.0
 **/
public class Switch implements NetworkDevice {
    private String type;
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked is Switch,type is "+this.type);

    }

    public Switch(String type) {
        this.type = type;
    }
}
