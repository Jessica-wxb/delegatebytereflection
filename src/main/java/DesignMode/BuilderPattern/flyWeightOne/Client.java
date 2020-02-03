package DesignMode.BuilderPattern.flyWeightOne;

import DesignMode.BuilderPattern.FlyweightPattern.DeviceFactory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 15:56
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        NetworkDevice nd1, nd2, nd3, nd4, nd5;
        DevicesFactory devicesFactory = new DevicesFactory();
        nd1 = devicesFactory.getNetworkDevice("cisco");
        nd1.use();
        nd2 = devicesFactory.getNetworkDevice("cisco");
        nd2.use();
        nd3 = devicesFactory.getNetworkDevice("cisco");
        nd3.use();
        nd4 = devicesFactory.getNetworkDevice("tp");
        nd4.use();
        nd5 = devicesFactory.getNetworkDevice("tp");
        nd5.use();
        System.out.println("Total Device:"+devicesFactory.getTotalDevices());
        System.out.println("Total Hub:"+devicesFactory.getTotalTeminal());

    }
}
