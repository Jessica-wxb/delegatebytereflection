package reviewone.creationalpattern.prototype.deepcloneprototype;

import java.io.Serializable;

/**
 * @ClassName Attachment
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/3 13:22
 * @Version 1.0
 **/
public class Attachment implements Serializable {
    public void download() {
        System.out.println("下载附件");
    }
}
