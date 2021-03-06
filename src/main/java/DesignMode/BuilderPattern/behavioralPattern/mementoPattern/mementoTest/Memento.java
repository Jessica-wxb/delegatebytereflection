package DesignMode.BuilderPattern.behavioralPattern.mementoPattern.mementoTest;

/**
 * @ClassName Memento
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/26 15:25
 * @Version 1.0
 **/
public class Memento {
    private String account;
    private String password;
    private String telNo;

    public Memento(String account, String password, String telNo) {
        this.account = account;
        this.password = password;
        this.telNo = telNo;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
