/**
 * Created by tian on 16-6-7.
 */
public class Handler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("hander2 chuli le");
        } else if (successor != null)
            successor.handleRequest(request);
    }
}
