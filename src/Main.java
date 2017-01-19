import java.util.Locale;

/**
 * 测试
 * Created by jay on 19/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        Cafe normalCafe = new NormalCafe();

        // 巧克力咖啡
        ChocolateCafe chocolateCafe = new ChocolateCafe(normalCafe);
        printCafe(chocolateCafe);

        // 牛奶咖啡
        MikeCafe mikeCafe = new MikeCafe(normalCafe);
        printCafe(mikeCafe);

        // 牛奶巧克力咖啡
        MikeCafe mikeChocolateCafe = new MikeCafe(chocolateCafe);
        printCafe(mikeChocolateCafe);

        // ... 你还可以随心所欲搭配出你自己喜欢的咖啡～
    }

    private static void printCafe(Cafe cafe){
        System.out.println(String.format(Locale.getDefault(), "Description: %s, price: $%.2f", cafe.description(), cafe.cost()));
    }
}
