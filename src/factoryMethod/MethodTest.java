package factoryMethod;

import simplenessFactory.Television;
import simplenessFactory.TelevisonFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class MethodTest {
    public static void main(String[] args) {
        TelevisionFactory televisonFactory =new HaierTelevisionFactory() ;
        Television televisions = televisonFactory.create();
        televisions.production();
    }
}
