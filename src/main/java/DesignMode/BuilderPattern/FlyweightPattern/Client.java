package DesignMode.BuilderPattern.FlyweightPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 15:34
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        NetworkDevice nd1, nd2, nd3, nd4, nd5;
        DeviceFactory df = new DeviceFactory();

        nd1 = df.getNetworkDevice("cisco");
        nd1.use();
        nd2= df.getNetworkDevice("cisco");
        nd2.use();
        nd3 = df.getNetworkDevice("cisco");
        nd3.use();
        nd4 = df.getNetworkDevice("tp");
        nd4.use();
        nd5 = df.getNetworkDevice("tp");
        nd5.use();

        System.out.println("Total Device:" + df.getTotalDevices());
        System.out.println("Total Terminal:"+df.getTotalTerminal());

    }
}
