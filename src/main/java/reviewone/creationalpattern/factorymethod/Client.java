package reviewone.creationalpattern.factorymethod;

import java.beans.Expression;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 13:31
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        try {
            TV tv;
            TVFactory tvFactory;
            HaierTV haierTV= new HaierTV();
            haierTV.play();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
