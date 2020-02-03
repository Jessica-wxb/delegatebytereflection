package DesignMode.BuilderPattern.Builder;

/**
 * @ClassName Builder
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/16 14:41
 * @Version 1.0
 **/
public abstract  class Builder {
    // Product 的依赖关系的体现
    protected Product product = new Product();
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();
    public Product getResult() {
        return product;
    }
}
