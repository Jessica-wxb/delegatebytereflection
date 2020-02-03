package reviewone.creationalpattern.prototype.extendprototype;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/3 13:46
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        PrototypeManager pm = new PrototypeManager();
        MyColor obj1 = (MyColor) pm.getColor("red");

        MyColor obj2 = (MyColor) pm.getColor("red");
        obj2.display();
        System.out.println(obj1==obj2);
    }
}
