package DesignMode.BuilderPattern.chainOfResponsibility;

/**
 * @ClassName Director
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 10:34
 * @Version 1.0
 **/
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("主任" + name +"审批员工："+ request.getLeaveName() + "的请假条，请假天数为" + request.getLeaveDays() + "天");
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
