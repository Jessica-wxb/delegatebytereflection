package DesignMode.BuilderPattern.second.chainOfR;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 11:07
 * @Version 1.0
 **/
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeavaDays() < 10) {
            System.out.println("经理" + name + "给员工" + request.getLeaveName() + "的请假条，请假天数为：" + request.getLeavaDays());
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
