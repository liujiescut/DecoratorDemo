/**
 * 巧克力装饰器
 * Created by jay on 17/01/2017.
 */
public class ChocolateCafe extends Composition {
    private static final double PRICE = 3.33;

    public ChocolateCafe(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String description() {
        return "Chocolate " + cafe.description();
    }

    @Override
    public double cost() {
        return cafe.cost() + PRICE;
    }
}
