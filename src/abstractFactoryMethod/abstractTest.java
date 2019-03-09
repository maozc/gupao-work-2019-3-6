package abstractFactoryMethod;

/**
 * Created by Administrator on 2019/3/9.
 */
public class abstractTest {
    public static void main(String[] args) {
        HaierElectricApplianceFactory electricApplianceFactory =new HaierElectricApplianceFactory();
        electricApplianceFactory.refrigerator().production();
        electricApplianceFactory.washingMachine().production();
    }
}
