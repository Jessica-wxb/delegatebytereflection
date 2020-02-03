package com.denamic.springbootfilter.event.delegatebyreflection;

/**
 * @ClassName HeaterEventTest
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/12 16:42
 * @Version 1.0
 **/
public class HeaterEventTest {
    public static void main(String[] args) {
        Integer temperature = 98;
        HeaterNotifier heaterNotifier = new HeaterNotifier();
        heaterNotifier.addListener(new AlarmListener(),"alertWarn",temperature);
        heaterNotifier.addListener(new DisplayListener(),"showTemperature",temperature);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        heaterNotifier.boilWater(temperature);
    }

}
