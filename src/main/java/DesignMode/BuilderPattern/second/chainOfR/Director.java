package DesignMode.BuilderPattern.second.chainOfR;

/**
 * @ClassName Director
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 11:03
 * @Version 1.0
 **/
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeavaDays() < 3) {
            System.out.println("主任" + name + "给员工" + request.getLeaveName() + "的请假条，请假天数为：" + request.getLeavaDays());
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(request);
            }
        }
    }
}
