/**
 * 配料基类
 * Created by jay on 17/01/2017.
 */
public abstract class Composition implements Cafe {
    protected Cafe cafe;

    public Composition(Cafe cafe) {
        this.cafe = cafe;
    }
}
