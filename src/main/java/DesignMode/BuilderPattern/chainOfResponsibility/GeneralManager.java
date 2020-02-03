package DesignMode.BuilderPattern.chainOfResponsibility;

/**
 * @ClassName GeneralManager
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 10:39
 * @Version 1.0
 **/
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("总经理" + name + "审批员工："+request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天");
        } else {

                System.out.println("莫非"+request.getLeaveName()+"想辞职，居然请假"+request.getLeaveDays());

        }
    }
}
