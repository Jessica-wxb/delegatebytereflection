package reviewone.creationalpattern.prototype.extendprototype;

/**
 * @ClassName Blue
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/3 13:41
 * @Version 1.0
 **/
public class Blue implements MyColor {
    @Override
    public Object clone() {
        Blue b = null;
        try {
            b = (Blue) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return b;
    }

    @Override
    public void display() {
        System.out.println("This is Blue");

    }
}
