package DesignMode.BuilderPattern.behavioralPattern.observerPattern;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 16:34
 * @Version 1.0
 **/
public class Cat extends MySubject {

    @Override
    public void cry() {
        System.out.println("猫叫");
        System.out.println("--------------------------------");
        for (Object obs:observers
             ) {
          (  (MyObserver)obs).response();

        }
    }
}
