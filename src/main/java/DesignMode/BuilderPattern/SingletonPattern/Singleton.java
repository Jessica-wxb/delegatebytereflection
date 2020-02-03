package DesignMode.BuilderPattern.SingletonPattern;

/**
 * @ClassName Singleton
 * @Description TODO  0
 * @Author 王小波
 * @Date 2019/12/16 16:28
 * @Version 1.0
 **/
public class Singleton {
    // 声明一个静态的类变量
    private static Singleton instance = null;

//    private static Singleton instance = null;

    // 构造方法私有，外部代码不能直接new来实例化它
    private Singleton() {
    }

/*    public static Singleton getInstance() {
        return instance;
    }*/
    // GetInstance()方法的目的是返回一个类实例，并且在此方法中判断是否有实例化的判断。如果没有则调用private的构造方法new这个实例。
    // 可以调用私有的Singleton()方法的原因是他们在同一个类中，private方法可以被调用。

public static Singleton getInstance() {
        // 判断是否实例化过，如果为null说明没有实例化过，则进行是实例化
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
