package DesignMode.BuilderPattern.behavioralPattern.mediator;

/**
 * @ClassName Client
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 10:04
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractChatroom happyChat = new ChatGroup();
        Member member1, member2, member3, member4, member5;

        member1 = new DiamondMember("小波");
        member2 = new DiamondMember("王雷");
        member3 = new CommonMember("小花");
        member4 = new CommonMember("小红");
        member5 = new CommonMember("红红");

        happyChat.register(member1);
        happyChat.register(member2);
        happyChat.register(member3);
        happyChat.register(member4);
        happyChat.register(member5);

        member1.sendText("小波","小波，你好！");
        member1.sendText("小波","小花今天天气不错，有日哦");

        member2.sendText("王雷", "王雷，你好！");
        member2.sendImage("王雷","一个很大很大的太阳");
        member2.sendImage("王雷","太阳图");

        member3.sendText("小花", "还有问题吗？");
        member3.sendText("小红","还有问题吗？");

        member4.sendText("红红","没有了，谢谢");

        member5.sendText("小波","测试测试");
        member5.sendImage("王五","谢谢");
    }
}
