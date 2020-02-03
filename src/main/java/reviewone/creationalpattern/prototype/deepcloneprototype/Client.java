package reviewone.creationalpattern.prototype.deepcloneprototype;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/3 13:28
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Email email, copyEmail = null;
        email = new Email();
        try {
            copyEmail = (Email) email.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("email==copyEmail");
        System.out.println(email==copyEmail);

        System.out.println("email.getAttachment==copyEmail.getAttachment");
        System.out.println(email.getAttachment()==copyEmail.getAttachment());

    }
}
