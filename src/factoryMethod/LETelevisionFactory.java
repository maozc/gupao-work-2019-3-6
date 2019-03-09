package factoryMethod;

import simplenessFactory.LETelevision;
import simplenessFactory.Television;
import simplenessFactory.TelevisonFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class LETelevisionFactory implements TelevisionFactory {
    @Override
    public Television create() {
        return new LETelevision();
    }
}
