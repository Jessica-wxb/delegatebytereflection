package DesignMode.BuilderPattern.behavioralPattern.templatePattern.template;

/**
 * @ClassName AbstractClass
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 15:03
 * @Version 1.0
 **/
public abstract class AbstractClass {
    public abstract void PrimitiveOperation1();

    public abstract void PrimitiveOperation2();
    public void TemplateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("抽象类模板方法");
    }
}
