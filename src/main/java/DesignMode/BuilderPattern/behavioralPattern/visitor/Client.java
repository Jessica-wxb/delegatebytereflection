package DesignMode.BuilderPattern.behavioralPattern.visitor;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:04
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ObjectStruct objectStruct = new ObjectStruct();
        objectStruct.add(new ConcreteElementA());
        objectStruct.add(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitor1();
        Visitor visitor1 = new ConcreteVisitor2();

        objectStruct.Accept(visitor);
        objectStruct.Accept(visitor1);

    }
}
