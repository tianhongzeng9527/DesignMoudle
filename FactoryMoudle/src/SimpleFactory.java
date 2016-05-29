/**
 * Created by tian on 16-5-29.
 * //简单工厂的实现方法
 */
public class SimpleFactory {
    public static LeiFeng CreateLeiFeng(String type){
        LeiFeng leiFeng = null;
        switch (type){
            case "xuesheng":
                leiFeng = new UnderGraduate();
                break;
            case "zhiyuanzhe":
                leiFeng = new Volunteer();
        }
        return leiFeng;
    }
}
