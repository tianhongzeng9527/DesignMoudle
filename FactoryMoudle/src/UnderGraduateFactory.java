/**
 * Created by tian on 16-5-29.
 */
public class UnderGraduateFactory implements Factory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new UnderGraduate();
    }
}
