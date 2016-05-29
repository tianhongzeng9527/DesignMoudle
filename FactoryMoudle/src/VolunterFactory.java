/**
 * Created by tian on 16-5-29.
 */
public class VolunterFactory implements Factory{

    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
