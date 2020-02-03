package DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne;

/**
 * @ClassName MulNode
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 14:43
 * @Version 1.0
 **/
public class MulNode extends SymbolNode {
    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()*super.right.interpret();
    }
}
