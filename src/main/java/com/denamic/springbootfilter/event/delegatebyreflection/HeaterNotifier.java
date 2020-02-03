package com.denamic.springbootfilter.event.delegatebyreflection;

/**
 * @ClassName HeaterNotifier
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/12 16:32
 * @Version 1.0
 **/
public class HeaterNotifier extends Notifier {
    private Integer temperature;
    @Override
    public void addListener(Object object, String methodName, Object... args) {
        System.out.println("有新的listener 委托尽职责的 Notifier 进行放哨");
        EventHandler handler = this.getEventHandler();
        handler.addEvent(object, methodName, args);
    }

    @Override
    public void notifyAllListeners() {
        System.out.println("尽职尽责的 Notifier 告诉有需要帮助通知的 listener 对象");
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void boilWater(Integer warningTemperature) {
        for (int i = 0; i <=100 ; i++) {
            this.temperature = i;
            // 当温度超过设定的阀值，通知Listeners,跳出循环
            if (warningTemperature < temperature) {
                notifyAllListeners();
                break;
            }
        }

    }
}
