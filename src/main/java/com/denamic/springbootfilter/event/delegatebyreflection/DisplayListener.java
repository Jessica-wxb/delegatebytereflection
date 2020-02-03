package com.denamic.springbootfilter.event.delegatebyreflection;

/**
 * @ClassName DisplayListener
 * @Description TODO  显示器 ：显示当前温度
 * @Author 王小波
 * @Date 2019/12/12 15:28
 * @Version 1.0
 **/
public class DisplayListener {
    public void showTemperature(Integer data) {
        System.out.println("Display当前温度是："+data+"");
    }
}
