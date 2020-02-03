package DesignMode.BuilderPattern.chainOfResponsibility;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 10:48
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Leader objDirector, objManager, objGeneralManager;

        objDirector = new Director("小龙");
        objManager = new Manager("白靖");
        objGeneralManager = new GeneralManager("小波");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("张三", 2);
        objDirector.handleRequest(lr1);

        LeaveRequest lr2= new LeaveRequest("小王", 9);
        objManager.handleRequest(lr2);

        LeaveRequest lr3 = new LeaveRequest("王雷", 29);
        objDirector.handleRequest(lr3);
        LeaveRequest lr4 = new LeaveRequest("王雷", 49);
        objDirector.handleRequest(lr4);

    }
}
