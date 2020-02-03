package DesignMode.BuilderPattern.Builder;

/**
 * @ClassName TestBuildPattern
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/16 15:10
 * @Version 1.0
 **/
public class TestBuildPattern {
    public static void main(String[] args) {
        Builder builder = new ConcretBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println("建筑的内容是：");
        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
        System.out.println(product.getPartC());
    }
}
