package DesignMode.BuilderPattern.behavioralPattern.mementoPattern.mementoPatternOnt;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 15:07
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        CareTaker careTaker = new CareTaker();

        userInfoDTO.setAccount("123345");
        userInfoDTO.setPassword("123456");
        userInfoDTO.setTelNo("13898990000000");
        System.out.println("状态一");
        userInfoDTO.show();
        careTaker.setMemento(userInfoDTO.saveMemento());

        System.out.println("=====================================");
        userInfoDTO.setPassword("1111111111");
        userInfoDTO.setTelNo("1300000103013");
        System.out.println("状态二");
        userInfoDTO.show();

        userInfoDTO.restoreMemento(careTaker.getMemento());
        System.out.println("回到状态一");
        userInfoDTO.show();
        System.out.println("=====================================================================");
    }
}
