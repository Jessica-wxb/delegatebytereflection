package DesignMode.BuilderPattern.FactoryMethodPattern;

/**
 * @ClassName HaierTVFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 10:07
 * @Version 1.0
 **/
public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        return new HaierTV();
    }
}
