package com.denamic.springbootfilter.event.delegatebyreflection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EventHandler
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/12 15:59
 * @Version 1.0
 **/
public class EventHandler {
    private List<Event> objects;

   /* public EventHandler(List<Event> objects) {
        this.objects = objects;
    }*/

    public EventHandler() {
        objects = new ArrayList<Event>();
    }

    /**
     * 添加某个对象要执行的事件，及需要的参数
     */

    /**
     * 通知所有的对象执行指定的事件
     * @throws Exception
     */
    public void notifyX() throws Exception {
        for (Event e:objects) {
            e.invoke();

        }
    }

    public void addEvent(Object object, String methodName, Object[] args) {
        objects.add(new Event(object,methodName,args));
    }
}
