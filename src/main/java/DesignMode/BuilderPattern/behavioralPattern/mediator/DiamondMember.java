package DesignMode.BuilderPattern.behavioralPattern.mediator;

/**
 * @ClassName DiamondMember
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:48
 * @Version 1.0
 **/
public class DiamondMember extends Member {
    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("钻石会员发送消息");
        chatroom.sendText(name, to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("钻石会员发送图片");
        chatroom.sendImage(name,to,image);

    }
}
