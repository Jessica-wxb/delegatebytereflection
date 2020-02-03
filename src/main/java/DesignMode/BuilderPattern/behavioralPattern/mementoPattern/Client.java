package DesignMode.BuilderPattern.behavioralPattern.mementoPattern;

import DesignMode.BuilderPattern.behavioralPattern.interpreterPattern.interpreterOne.Calculator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 11:41
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        CareTaker careTaker = new CareTaker();

        user.setAccount("wangxiaobo");
        user.setPassword("123456");
        user.setTelNo("121i039280000000000000");
        System.out.println("状态一：");
        user.show();
        careTaker.setMemento(user.saveMemento());
        // 保存备忘录
        System.out.println("----------------------------------");
        user.setPassword("1111111");
        user.setTelNo("13100001111");
        System.out.println("状态二：");
        user.show();
        System.out.println("---------------------------");
        // 从备忘录中恢复
        user.restoreMemento(careTaker.getMemento());
        System.out.println("回到状态一：");
        user.show();
        System.out.println("--------------------------------");
    }
}
