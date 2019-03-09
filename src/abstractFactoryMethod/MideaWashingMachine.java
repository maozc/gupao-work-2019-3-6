package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class MideaWashingMachine implements WashingMachine {
    @Override
    public void production() {
        System.out.println("美的洗衣机");
    }
}
