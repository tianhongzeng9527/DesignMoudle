/**
 * Created by tian on 16-6-9.
 */
public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
