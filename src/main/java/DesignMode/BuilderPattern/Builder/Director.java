package DesignMode.BuilderPattern.Builder;

/**
 * @ClassName Director
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/16 14:41
 * @Version 1.0
 **/
public class Director {
    private Builder builder;

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
