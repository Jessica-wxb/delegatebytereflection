package reviewone.creationalpattern.factorymethod;

import reviewone.creationalpattern.simplefactory.HisenseTV;

/**
 * @ClassName HisenseTVFactory
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 13:30
 * @Version 1.0
 **/
public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("海信电视机工厂生产海信电视机");
        return new Hisense();
    }
}
