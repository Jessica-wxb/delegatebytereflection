package DesignMode.BuilderPattern.behavioralPattern.test.visitor;

/**
 * @ClassName Element
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:08
 * @Version 1.0
 **/
public abstract class Element {
    public abstract void Accept(Visitor visitor);
}
