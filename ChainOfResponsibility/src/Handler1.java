/**
 * Created by tian on 16-6-7.
 */
public class Handler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("hanler1 chuli le ");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
