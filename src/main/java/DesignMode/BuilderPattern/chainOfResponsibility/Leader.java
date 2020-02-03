package DesignMode.BuilderPattern.chainOfResponsibility;

/**
 * @ClassName Leader
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/23 10:32
 * @Version 1.0
 **/
public abstract  class Leader {
    protected String name;
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveRequest request);
}
