package DesignMode.BuilderPattern.behavioralPattern.test.visitor;

/**
 * @ClassName ConcreteElementA
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:09
 * @Version 1.0
 **/
public class ConcreteElementA extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
        OperatorA();
    }


    private void OperatorA() {
        System.out.println("A特有的方法");
    }
}
