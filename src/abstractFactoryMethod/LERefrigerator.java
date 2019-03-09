package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class LERefrigerator implements  Refrigerator {
    @Override
    public void production() {
        System.out.println("乐视冰箱");
    }
}
