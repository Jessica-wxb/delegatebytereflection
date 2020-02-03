package DesignMode.BuilderPattern.SimpleFactory;

/**
 * @ClassName TVFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 8:40
 * @Version 1.0
 **/
public class TVFactory {
    public static TV produceTV(String brand)throws Exception {
        if (brand.equalsIgnoreCase("Haier")) {
            System.out.println("电视机工厂生产海尔电视机");
            return new HaierTV();
        } else if (brand.equalsIgnoreCase("Hisense")) {
            System.out.println("电视机工厂生产海信的电视机！");
            return new HisenseTV();
        } else {
            throw new Exception("对不起，暂时不能生产该品牌的电视机！");
        }
    }
}
