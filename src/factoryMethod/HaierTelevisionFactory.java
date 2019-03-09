package factoryMethod;

import simplenessFactory.Television;
import simplenessFactory.HaierTelevision;

/**
 * Created by Administrator on 2019/3/9.
 */
public class HaierTelevisionFactory implements TelevisionFactory{
    @Override
    public Television create() {
        return new HaierTelevision();
    }
}
