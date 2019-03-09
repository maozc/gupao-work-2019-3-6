package simplenessFactory;

/**
 * Created by Administrator on 2019/3/9.
 */
public class TelevisonFactory {
    public Television create(String name){
        if("海尔".equals(name)){
            return  new HaierTelevision();
        }else if("美的".equals(name)){
            return new MideaTelevision();
        }else if("格力".equals(name)){
            return  new LETelevision();
        }else {
            return  null;
        }
    }
}
