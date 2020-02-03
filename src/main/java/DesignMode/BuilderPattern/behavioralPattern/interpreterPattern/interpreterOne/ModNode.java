package DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne;

/**
 * @ClassName ModNode
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 14:45
 * @Version 1.0
 **/
public class ModNode extends SymbolNode {
    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()%super.right.interpret();
    }
}
