package DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne;

/**
 * @ClassName SymbolNode
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 14:41
 * @Version 1.0
 **/
public abstract class SymbolNode implements Node {
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

}
