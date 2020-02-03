package DesignMode.BuilderPattern.PrototypePattern;

import java.io.IOException;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 15:44
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Email email, copyEmail = null;
        email = new Email();
        try {
            copyEmail=(Email)email.deepClone();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("email==copyEmail?");
        System.out.println(email==copyEmail);
        System.out.println("email.getAttachment()==copyEmail.getAttachment()?");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());
    }
}
