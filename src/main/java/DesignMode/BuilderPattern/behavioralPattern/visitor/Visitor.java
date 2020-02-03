package DesignMode.BuilderPattern.behavioralPattern.visitor;

/**
 * @ClassName Visitor
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 17:26
 * @Version 1.0
 **/
public abstract class Visitor {
    public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void VisitConcretElementB(ConcreteElementB concreteElementB);
}
