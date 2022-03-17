package decker_mode;

public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
        super(fastFood, 1,"鸡蛋");//因为鸡蛋继承了FastFood，所以他也会又这两个属性price和desc
    }

    /**
     * 这个cost()方法是Garnish父类FastFood类的,也就是Egg类的爷爷类
     */
    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getPrice();
    }
}
