package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class MideaElectricApplianceFactory implements ElectricApplianceFactory {
    @Override
    public Refrigerator refrigerator() {
        return new MideaRefrigerator();
    }

    @Override
    public WashingMachine washingMachine() {
        return new MideaWashingMachine();
    }
}
