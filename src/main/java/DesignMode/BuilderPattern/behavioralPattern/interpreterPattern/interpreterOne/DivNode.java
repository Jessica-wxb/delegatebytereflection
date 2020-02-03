package DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne;

/**
 * @ClassName DivNode
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 14:44
 * @Version 1.0
 **/
public class DivNode extends SymbolNode {
    public DivNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()/super.right.interpret();
    }
}
