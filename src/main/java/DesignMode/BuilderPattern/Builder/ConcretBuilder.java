package DesignMode.BuilderPattern.Builder;

/**
 * @ClassName ConcretBuilder
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/16 14:51
 * @Version 1.0
 **/
public class ConcretBuilder extends Builder {
//    protected Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("一栋别墅");
    }

    @Override
    public void buildPartB() {
        product.setPartB("一辆红色法拉利");

    }

    @Override
    public void buildPartC() {
        product.setPartC("站在万人的舞台上演讲");

    }
}
