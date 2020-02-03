package DesignMode.BuilderPattern.CompositePattern;

import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 11:14
 * @Version 1.0
 **/
public class Apple extends MyElement {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
