package DesignMode.BuilderPattern.behavioralPattern.templatePattern.template;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 15:07
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.TemplateMethod();

        AbstractClass b = new ConcreteClassB();
        b.TemplateMethod();
    }
}
