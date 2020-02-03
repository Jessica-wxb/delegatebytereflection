package DesignMode.BuilderPattern.behavioralPattern.visitor;

/**
 * @ClassName ConcreteVisitor1
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 17:27
 * @Version 1.0
 **/
public class ConcreteVisitor1 extends Visitor{
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("访问者："+this.getClass().getSimpleName()+"---"+"访问对象为："+concreteElementA.getClass().getSimpleName());

    }

    @Override
    public void VisitConcretElementB(ConcreteElementB concreteElementB) {
        System.out.println("访问者："+this.getClass().getSimpleName()+"---"+"访问对象为："+concreteElementB.getClass().getSimpleName());

    }
}
