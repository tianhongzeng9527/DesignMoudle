import java.util.ArrayList;
import java.util.List;

/**
 * Created by tian on 16-6-3.
 */
public abstract class Subject {
    private List<Observe> observes = new ArrayList<>();

    public void attach(Observe observe) {
        observes.add(observe);
    }

    public void detach(Observe observe) {
        observes.remove(observe);
    }

    public void notity() {
        for (Observe observe : observes) {
            observe.update();
        }
    }
}
