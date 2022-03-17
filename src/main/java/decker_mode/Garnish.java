package decker_mode;

/**
 * 配料类
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;


    public FastFood getFastFood() {
        return fastFood;
    }


    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    //对于点了fastfood又加了配料
    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
