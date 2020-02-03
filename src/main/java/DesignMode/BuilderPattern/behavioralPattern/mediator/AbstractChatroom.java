package DesignMode.BuilderPattern.behavioralPattern.mediator;

/**
 * @ClassName AbstractChatroom
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/28 9:47
 * @Version 1.0
 **/
public abstract class AbstractChatroom {
    public abstract void register(Member member);

    public abstract void sendText(String from, String to, String message);

    public abstract void sendImage(String from, String to, String image);


}
