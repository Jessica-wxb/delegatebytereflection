package DesignMode.BuilderPattern.behavioralPattern.visitorPattern;

/**
 * @ClassName Element
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 16:44
 * @Version 1.0
 **/
public abstract class Element {
    // 元素接收的访问者
    public abstract void Accept(Visitor visitor);
}
