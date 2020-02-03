package DesignMode.BuilderPattern.second.chainOfR;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 11:09
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Leader objDirector, objManager, objGeneralManager;

        objDirector = new Director("王明");
        objManager = new Manager("小红");
        objGeneralManager = new GeneralManager("蕾蕾");

        objDirector.setSuccessor(objManager);
        objManager.setSuccessor(objGeneralManager);

        LeaveRequest lr1 = new LeaveRequest("王小波", 2);
        objDirector.handleRequest(lr1);

        LeaveRequest lr2 = new LeaveRequest("王小波", 9);
        objDirector.handleRequest(lr2);
        LeaveRequest lr3 = new LeaveRequest("王小波", 23);
        objDirector.handleRequest(lr3);
        LeaveRequest lr4 = new LeaveRequest("王小波", 56);
        objDirector.handleRequest(lr4);

    }
}
