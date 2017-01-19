/**
 * 牛奶装饰器
 * Created by jay on 17/01/2017.
 */
public class MikeCafe extends Composition {
    private static final double PRICE = 2.33;

    public MikeCafe(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String description() {
        return "Mike " + cafe.description();
    }

    @Override
    public double cost() {
        return cafe.cost() + PRICE;
    }
}
