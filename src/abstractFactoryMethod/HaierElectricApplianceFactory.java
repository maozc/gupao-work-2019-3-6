package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class HaierElectricApplianceFactory implements ElectricApplianceFactory{
    @Override
    public Refrigerator refrigerator() {
        return new HaierRefrigerator();
    }

    @Override
    public WashingMachine washingMachine() {
        return new HaierWashingMachine();
    }
}
