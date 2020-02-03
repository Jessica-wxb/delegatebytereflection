package reviewone.creationalpattern.prototype.extendprototype;

/**
 * @ClassName Red
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/3 13:38
 * @Version 1.0
 **/
public class Red implements MyColor {
    @Override
    public Object clone() {
        Red r = null;
        try {
            r = (Red) super.clone();
        } catch (CloneNotSupportedException e) {

        }

        return r;
    }

    @Override
    public void display() {
        System.out.println("This is Red");

    }
}
