package DesignMode.BuilderPattern.FacadePattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 11:04
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade generalSwitchFacade = new GeneralSwitchFacade();
        generalSwitchFacade.on();
        System.out.println("=========================");
        generalSwitchFacade.off();
    }

}
