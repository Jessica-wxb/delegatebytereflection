package DesignMode.BuilderPattern.behavioralPattern.test.visitor;

/**
 * @ClassName ConcreteElementB
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:09
 * @Version 1.0
 **/
public class ConcreteElementB extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
        OperatorB();
    }


    private void OperatorB() {
        System.out.println("B特有的方法");
    }
}
