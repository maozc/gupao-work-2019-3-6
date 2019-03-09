package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class LEElectricApplianceFactory implements ElectricApplianceFactory{
    @Override
    public Refrigerator refrigerator() {
        return new LERefrigerator();
    }

    @Override
    public WashingMachine washingMachine() {
        return new LEWashingMachine();
    }
}
