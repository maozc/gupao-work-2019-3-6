package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public interface ElectricApplianceFactory {
    //冰箱
    Refrigerator refrigerator();
    //洗衣机
    WashingMachine washingMachine();
}
