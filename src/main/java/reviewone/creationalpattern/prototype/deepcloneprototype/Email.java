package reviewone.creationalpattern.prototype.deepcloneprototype;

import java.io.*;

/**
 * @ClassName Email
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/3 13:22
 * @Version 1.0
 **/
public class Email implements Serializable {

    private Attachment attachment = null;

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
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
    public void display() {
        System.out.println("查看邮件");
    }
}
