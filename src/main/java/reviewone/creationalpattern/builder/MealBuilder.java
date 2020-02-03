package reviewone.creationalpattern.builder;

/**
 * @ClassName MealBuilder
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:47
 * @Version 1.0
 **/
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();
    public Meal getMeal() {
        return meal;
    }

}
