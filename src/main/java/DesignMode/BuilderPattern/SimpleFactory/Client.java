package DesignMode.BuilderPattern.SimpleFactory;

import DesignMode.BuilderPattern.SimpleFactory.XMLUtilTV;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 8:55
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        try {
            TV tv; // 抽象类型定义fr
            String brandName = XMLUtilTV.getBrandName();
            tv = TVFactory.produceTV(brandName);
            tv.paly();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
