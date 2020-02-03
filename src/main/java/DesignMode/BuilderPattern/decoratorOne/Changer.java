package DesignMode.BuilderPattern.decoratorOne;

/**
 * @ClassName Changer
 * @Description TODO
 * @Author 王小波
 * @Date 2019/12/21 9:16
 * @Version 1.0
 **/
public  class Changer implements Transform{
    private Transform transform;
    @Override
    public void move() {
        transform.move();

    }

    public Changer(Transform transform) {
        this.transform = transform;
    }
}
