package DesignMode.BuilderPattern.behavioralPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectStruct
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 17:26
 * @Version 1.0
 **/
public class ObjectStruct {
    //    private ArrayList<Element> elements = new ArrayList<>();
    private List<Element> elements = new ArrayList<>();
    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }
    public void Accept(Visitor visitor) {
        for (Element element:elements
             ) {
            element.Accept(visitor);
        }
    }
}
