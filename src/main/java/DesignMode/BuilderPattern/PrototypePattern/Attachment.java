package DesignMode.BuilderPattern.PrototypePattern;

import java.io.Serializable;

/**
 * @ClassName Attachment
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/19 14:59
 * @Version 1.0
 **/
public class Attachment implements Serializable {
    public void download() {
        System.out.println("下载附件");
    }
}
