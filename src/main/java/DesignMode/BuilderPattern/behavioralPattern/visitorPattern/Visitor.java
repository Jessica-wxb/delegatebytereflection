package DesignMode.BuilderPattern.behavioralPattern.visitorPattern;

/**
 * @ClassName Visitor
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 16:43
 * @Version 1.0
 **/
public abstract class Visitor {
    public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);
}
