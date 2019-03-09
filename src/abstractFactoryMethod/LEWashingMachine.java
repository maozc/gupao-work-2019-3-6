package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class LEWashingMachine implements  WashingMachine{
    @Override
    public void production() {
        System.out.println("乐视洗衣机");
    }
}
