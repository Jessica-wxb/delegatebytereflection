package reviewone.creationalpattern.prototype.extendprototype;

import java.util.Hashtable;

/**
 * @ClassName PrototypeManager
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/3 13:43
 * @Version 1.0
 **/
public class PrototypeManager {
    private Hashtable ht = new Hashtable();

    public PrototypeManager() {
        ht.put("red", new Red());
        ht.put("blue", new Blue());
    }

    public void addColor(String key, MyColor obj) {
        ht.put(key, obj);
    }

    public MyColor getColor(String key) {
        return (MyColor) ((MyColor) ht.get(key)).clone();
    }
}
