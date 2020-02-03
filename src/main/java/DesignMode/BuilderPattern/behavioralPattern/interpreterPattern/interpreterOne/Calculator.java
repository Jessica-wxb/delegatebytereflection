package DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne;

import java.util.Stack;

/**
 * @ClassName Calculator
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/24 14:39
 * @Version 1.0
 **/
public class Calculator {
    private String statement;
    private Node node;

    public void build(String statement) {
        // left,right设定初始值为null
        Node left = null, right = null;
        // 实例化stack
        Stack stack = new Stack();
        // 将statement 的值切割“” ,将结果放到statementArr数组中
        String[] statementArr = statement.split("");

        for (int i = 0; i <statementArr.length ; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new MulNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new DivNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = (Node) stack.pop();
                int val = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(val);
                stack.push(new ModNode(left, right));

            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }


        }
        this.node = (Node) stack.pop();
    }
    public int compute() {
        return node.interpret();
    }
}
