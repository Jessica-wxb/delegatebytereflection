package reviewone.creationalpattern.builder;

/**
 * @ClassName SubMealBuilderA
 * @Description TODO
 * @Author 王小波
 * @Date 2020/1/2 22:53
 * @Version 1.0
 **/
public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一个鸡腿堡");

    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");

    }
}
