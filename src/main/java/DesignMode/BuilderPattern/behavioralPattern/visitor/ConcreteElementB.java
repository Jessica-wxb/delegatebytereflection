package DesignMode.BuilderPattern.behavioralPattern.visitor;

import org.springframework.expression.spel.ast.Operator;

/**
 * @ClassName ConcreteElementB
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 17:27
 * @Version 1.0
 **/
public class ConcreteElementB extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcretElementB(this);
        OperatorB();

    }

    private void OperatorB() {
        System.out.println("B特有的方法OperatorB");
    }
}
