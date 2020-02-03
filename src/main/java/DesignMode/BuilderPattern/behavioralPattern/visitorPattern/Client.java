package DesignMode.BuilderPattern.behavioralPattern.visitorPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 16:58
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitor1();
        Visitor visitor1 = new ConcreteVisitor2();

        objectStructure.Accept(visitor);
        objectStructure.Accept(visitor1);

    }
}
