package DesignMode.BuilderPattern.behavioralPattern.mediator;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

/**
 * @ClassName CommonMember
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:49
 * @Version 1.0
 **/
public class CommonMember extends Member {
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送消息");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员不能发送图片");
    }
}
