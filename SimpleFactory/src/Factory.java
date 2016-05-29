/**
 * Created by tian on 16-5-28.
 */
public class Factory{
    public Operation createOperate(String operate){
        switch (operate){
            case "+":
                return new Add();
            case "-":
                return new Sub();
        }
        return null;
    }
}
