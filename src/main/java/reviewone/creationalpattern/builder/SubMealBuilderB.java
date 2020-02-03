package reviewone.creationalpattern.builder;

/**
 * @ClassName SubMealBuilderB
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:55
 * @Version 1.0
 **/
public class SubMealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一个全家桶");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯咖啡");
    }
}
