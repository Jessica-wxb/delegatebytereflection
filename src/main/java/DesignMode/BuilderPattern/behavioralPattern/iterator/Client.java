package DesignMode.BuilderPattern.behavioralPattern.iterator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 15:49
 * @Version 1.0
 **/
public class Client {
    public static void display(Televison tv) {
        TVIterator i = tv.createIterator();
        System.out.println("电视频道：");
        while (!i.isLast()) {
            System.out.println(i.currentChannel().toString());
            i.next();
        }
    }

    public static void reverseDipaly(Televison tv) {
        TVIterator i = tv.createIterator();
        i.setChannel(6);
        System.out.println("逆向遍历电视频道：");
        while (!i.isFirst()) {
            i.prevous();
            System.out.println(i.currentChannel().toString());
        }
    }

    public static void main(String[] args) {
        Televison tv;
        tv = (Televison) new TCLTelevision();
        display(tv);
        System.out.println("-------------");
        reverseDipaly(tv);
    }
}
