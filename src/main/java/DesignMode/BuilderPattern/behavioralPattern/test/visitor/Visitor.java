package DesignMode.BuilderPattern.behavioralPattern.test.visitor;

/**
 * @ClassName Visitor
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:08
 * @Version 1.0
 **/
public abstract class Visitor {
    public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);
}
