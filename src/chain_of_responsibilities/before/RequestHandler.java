package chain_of_responsibilities.before;

public class RequestHandler {
    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
