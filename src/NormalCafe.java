/**
 * 咖啡
 * Created by jay on 17/01/2017.
 */
public class NormalCafe implements Cafe {
    @Override
    public double cost() {
        return 2.22;
    }

    @Override
    public String description() {
        return "Cafe";
    }
}
