package reviewone.creationalpattern.builder;

/**
 * @ClassName KFCWaiter
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:47
 * @Version 1.0
 **/
public class KFCWaiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}
