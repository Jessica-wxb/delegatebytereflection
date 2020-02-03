package DesignMode.BuilderPattern.behavioralPattern.mementoPattern.mementoTest;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 15:24
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        CareTake careTake = new CareTake();

        userInfoDTO.setAccount("1214514");
        userInfoDTO.setPassword("13324564");
        userInfoDTO.setTelNo("2313454561");
        System.out.println("状态一");
        userInfoDTO.show();
        careTake.setMemento(userInfoDTO.saveMemento());
        System.out.println("======================");


        userInfoDTO.setPassword("4546546");
        userInfoDTO.setTelNo("898090909");
        System.out.println("状态二");
        userInfoDTO.show();
        System.out.println("---------------------");

        userInfoDTO.restoreMemento(careTake.getMemento());
        System.out.println("回到状态一");
        userInfoDTO.show();
        System.out.println("----------------------------------------");
    }
}
