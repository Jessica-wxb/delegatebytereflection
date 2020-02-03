package DesignMode.BuilderPattern.FacadePattern;

import DesignMode.BuilderPattern.AbstractFactory.Factory;

/**
 * @ClassName GeneralSwitchFacade
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 10:50
 * @Version 1.0
 **/
public class GeneralSwitchFacade {
    private Light lights[] = new Light[4];
    private Fan fan;
    private AirConditioner airConditioner;
    private Television television;

    public GeneralSwitchFacade() {
        lights[0] = new Light("左前");
        lights[1] = new Light("右前");
        lights[2] = new Light("左后");
        lights[3] = new Light("右后");
         fan = new Fan();
         airConditioner = new AirConditioner();
         television = new Television();

    }
    public void on() {
        lights[0].on();
        lights[1].on();
        lights[2].on();
        lights[3].on();
        fan.on();
        airConditioner.on();
        television.on();
    }

    public void off() {
        lights[0].off();
        lights[1].off();
        lights[2].off();
        lights[3].off();
        fan.off();
        airConditioner.off();
        television.off();
    }

}
