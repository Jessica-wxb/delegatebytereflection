package DesignMode.BuilderPattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Plate
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/20 11:45
 * @Version 1.0
 **/
public class Plate extends MyElement {
    private ArrayList  list = new ArrayList();

    public void setList(ArrayList list) {
        this.list = list;
    }

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
            ((MyElement)object).eat();

        }
    }
}
