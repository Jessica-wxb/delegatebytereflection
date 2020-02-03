package DesignMode.BuilderPattern.second.chainOfR;

/**
 * @ClassName LeaveRequest
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 11:01
 * @Version 1.0
 **/
public class LeaveRequest {
    private String leaveName;
    private int leavaDays;

    public LeaveRequest(String leaveName, int leavaDays) {
        this.leaveName = leaveName;
        this.leavaDays = leavaDays;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public int getLeavaDays() {
        return leavaDays;
    }

    public void setLeavaDays(int leavaDays) {
        this.leavaDays = leavaDays;
    }
}
