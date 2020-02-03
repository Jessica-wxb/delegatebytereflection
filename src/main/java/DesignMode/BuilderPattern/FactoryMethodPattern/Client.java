package DesignMode.BuilderPattern.FactoryMethodPattern;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 10:15
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        try {
            TV tv;
            TVFactory factory;
            factory = (TVFactory) XMLUtilAll.getBean();
            tv = factory.produceTV();
            tv.paly();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
