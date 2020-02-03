package DesignMode.BuilderPattern.behavioralPattern.visitor;

/**
 * @ClassName Element
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 17:26
 * @Version 1.0
 **/
public abstract class Element {
    public abstract void Accept(Visitor visitor);
}
