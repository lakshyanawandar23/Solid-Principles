package COR.Handlers;

public class AuthenticationHandler implements RequestHandler {
    private final RequestHandler nextHandler; // Next handler in the chain
    
    public AuthenticationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler; // Set the next handler in the chain
        // Constructor logic if needed
    }
    @Override
    public void handle(Request request) {
        // Authentication logic here
        System.out.println("Handling authentication request");
        // Pass the request to the next handler in the chain if needed
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
    
}
