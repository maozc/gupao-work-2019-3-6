package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class HaierWashingMachine implements WashingMachine{
    @Override
    public void production() {
        System.out.println("海尔洗衣机");
    }
}
