package DesignMode.BuilderPattern.chainOfResponsibility;

/**
 * @ClassName LeaveRequest
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 10:31
 * @Version 1.0
 **/
public class LeaveRequest {
    private String leaveName;
    private int leaveDays;

    public LeaveRequest(String leaveName, int leaveDays) {
        this.leaveName = leaveName;
        this.leaveDays = leaveDays;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
