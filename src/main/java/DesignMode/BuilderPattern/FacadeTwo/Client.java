package DesignMode.BuilderPattern.FacadeTwo;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 11:20
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade gsf = new GeneralSwitchFacade();
        gsf.on();
        System.out.println("-------------------------");
        gsf.off();
    }
}
