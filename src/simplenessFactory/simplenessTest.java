package simplenessFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class simplenessTest {
    public static void main(String[] args) {
        TelevisonFactory  factory = new TelevisonFactory();
        Television a = factory.create("美的");
        a.production();
    }
}
