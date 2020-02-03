package com.denamic.springbootfilter.event.delegatebyreflection;

/**
 * @ClassName AlarmListener
 * @Description TODO  定义一个闹钟响的方法
 * @Author 王小波
 * @Date 2019/12/12 15:24
 * @Version 1.0
 **/
public class AlarmListener {
    public void alertWarn(Integer data) {
        System.out.println("===Alarm warn!!! 水已经烧开了！当前温度"+data+"");

    }
}
