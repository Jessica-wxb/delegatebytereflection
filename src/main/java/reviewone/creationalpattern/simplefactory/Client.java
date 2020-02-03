package reviewone.creationalpattern.simplefactory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 13:20
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        try {
            TV tv;// 抽象类型定义
            HaierTV haierTV = new HaierTV();
            haierTV.play();

            HisenseTV hisenseTV = new HisenseTV();
            hisenseTV.play();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
