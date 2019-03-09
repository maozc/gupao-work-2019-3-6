package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class MideaRefrigerator implements Refrigerator {
    @Override
    public void production() {
        System.out.println("美的冰箱");
    }
}
