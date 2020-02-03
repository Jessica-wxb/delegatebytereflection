package DesignMode.BuilderPattern.behavioralPattern.visitorPattern;

/**
 * @ClassName ConcreteVisitor1
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 16:45
 * @Version 1.0
 **/
public class ConcreteVisitor1  extends Visitor{
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("访问者："+this.getClass().getSimpleName()+"---------"+"访问者对象："+concreteElementA.getClass().getSimpleName());
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("访问者："+this.getClass().getSimpleName()+"---------"+"访问者对象："+concreteElementB.getClass().getSimpleName());

    }
}
