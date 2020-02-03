package DesignMode.BuilderPattern.PrototypePattern;

import java.io.*;

/**
 * @ClassName Email
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 14:59
 * @Version 1.0
 **/
public class Email implements Serializable{

    private Attachment attachment = null;
// 组合关系怎么体现，在整体类的构造直接实例化成员类。
    public Email() {
        this.attachment = new Attachment();
    }
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ois.readObject());


    }

    public Attachment getAttachment() {
        return this.attachment;
    }
    public void display() {
        System.out.println("查看邮件");
    }

}
