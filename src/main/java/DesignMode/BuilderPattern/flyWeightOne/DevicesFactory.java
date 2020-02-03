package DesignMode.BuilderPattern.flyWeightOne;

import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 * @ClassName DevicesFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 15:45
 * @Version 1.0
 **/
public class DevicesFactory {
    private ArrayList devices = new ArrayList();
    private int totalTeminal=0;

    public DevicesFactory() {
        NetworkDevice nd1 = new Switch("Cisco-WS-C2950-24");
        devices.add(nd1);
        NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
        devices.add(nd2);
    }

    public NetworkDevice getNetworkDevice(String type) {
        if (type.equalsIgnoreCase("cisco")) {
            totalTeminal++;
            return (NetworkDevice) devices.get(0);

        } else if (type.equalsIgnoreCase("tp")) {
            totalTeminal++;
            return (NetworkDevice) devices.get(1);
        } else {
            return null;
        }

    }

    public int getTotalDevices() {
        return devices.size();
    }

    public int getTotalTeminal() {
        return totalTeminal;
    }
}
