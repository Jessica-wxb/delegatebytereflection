package DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne;

/**
 * @ClassName ValueNode
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 14:40
 * @Version 1.0
 **/
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
