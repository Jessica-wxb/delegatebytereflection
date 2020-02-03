package DesignMode.BuilderPattern.behavioralPattern.visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObjectStructure
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/27 16:44
 * @Version 1.0
 **/
public class ObjectStructure {
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
