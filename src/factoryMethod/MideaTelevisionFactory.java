package factoryMethod;

import simplenessFactory.MideaTelevision;
import simplenessFactory.Television;

/**
 * Created by Administrator on 2019/3/9.
 */
public class MideaTelevisionFactory implements TelevisionFactory{
    @Override
    public Television create() {
        return new MideaTelevision();
    }
}
