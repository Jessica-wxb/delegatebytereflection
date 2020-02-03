package DesignMode.BuilderPattern.decoratorTwo;

/**
 * @ClassName Changer
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:52
 * @Version 1.0
 **/
public class Changer implements Transform {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
      transform.move();
    }
}
