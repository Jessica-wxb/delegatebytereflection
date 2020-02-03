package DesignMode.BuilderPattern.CompositePattern;

import java.util.ArrayList;

/**
 * @ClassName Plate
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 11:15
 * @Version 1.0
 **/
public class Plate extends MyElement {
    private ArrayList list = new ArrayList();

    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }

    @Override
    public void eat() {
        for (Object object:list
             ) {
            ((MyElement) object).eat();

        }

    }
}
