package DesignMode.BuilderPattern.second.chainOfR;

/**
 * @ClassName GeneralManager
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 11:07
 * @Version 1.0
 **/
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeavaDays() < 30) {
            System.out.println("总经理" + name + "给员工" + request.getLeaveName() + "的请假条，请假天数为：" + request.getLeavaDays());
        } else {
            System.out.println( "莫非"+request.getLeaveName() + "想辞职，请假天数为：" + request.getLeavaDays());

        }
    }
}
