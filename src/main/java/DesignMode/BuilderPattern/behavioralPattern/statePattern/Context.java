package DesignMode.BuilderPattern.behavioralPattern.statePattern;

/**
 * @ClassName Context
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 9:01
 * @Version 1.0
 **/
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }



    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态："+state.getClass().getTypeName());
    }
    public void Request() {
        state.Handle(this);

    }
}
