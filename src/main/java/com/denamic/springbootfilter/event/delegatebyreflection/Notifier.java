package com.denamic.springbootfilter.event.delegatebyreflection;

/**
 * @ClassName Notifier
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/12 16:25
 * @Version 1.0
 **/
public abstract class Notifier {
    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    /**
     * 增加需要帮忙 放哨的Listener
     *
     * @param object     要执行方法的对象
     * @param methodName 执行方法的方法名
     * @param args       执行方法的参数
     */
    public abstract void addListener(Object object, String methodName,
                                     Object... args);

    /**
     * 告诉所有要帮忙放哨的Listener
     */
    public abstract void notifyAllListeners();
}
