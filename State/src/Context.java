/**
 * Created by tian on 16-6-9.
 */
public class Context {
    private State state;
    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println(state.getClass().toString());
    }
    public void request(){
        state.Handle(this);
    }
}
