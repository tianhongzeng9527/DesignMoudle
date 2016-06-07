/**
 * Created by tian on 16-6-7.
 */
public class Handler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 20){
            System.out.println("handler3 chuli le");
        }
        else if (successor != null)
            successor.handleRequest(request);
    }
}
