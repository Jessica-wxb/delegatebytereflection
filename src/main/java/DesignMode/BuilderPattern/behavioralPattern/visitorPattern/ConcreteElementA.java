package DesignMode.BuilderPattern.behavioralPattern.visitorPattern;

import org.springframework.expression.spel.ast.Operator;

/**
 * @ClassName ConcreteElementA
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 16:44
 * @Version 1.0
 **/
public class ConcreteElementA extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
        OperatorA();
    }

    private void OperatorA() {
        System.out.println("A特有的方法OperatorA");
    }

}
