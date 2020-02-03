package DesignMode.BuilderPattern.behavioralPattern.test.visitor;

/**
 * @ClassName ConcreteVisitor2
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:09
 * @Version 1.0
 **/
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("访问者："+this.getClass().getSimpleName()+"-----"+"访问对象为："+concreteElementA.getClass().getSimpleName());
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("访问者："+this.getClass().getSimpleName()+"-----"+"访问对象为："+concreteElementB.getClass().getSimpleName());

    }
}
