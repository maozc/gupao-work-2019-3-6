package abstractFactoryMethod;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 2019/3/9.
 */
public class HaierRefrigerator implements  Refrigerator{
    @Override
    public void production() {
        System.out.println("海尔冰箱");
    }
}
