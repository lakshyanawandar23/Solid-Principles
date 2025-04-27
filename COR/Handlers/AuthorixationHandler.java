package COR.Handlers;

public class AuthorixationHandler implements RequestHandler {

   private final RequestHandler nextHandler;
    public AuthorixationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler; // Set the next handler in the chain
    }
    @Override
    public void handle(Request request) {
        // Implement authorization logic here
        // For example, check if the user has the necessary permissions to access the requested resource
        System.out.println("AuthorizationHandler: Checking authorization for request: " + request.getRequestType());
        this.nextHandler.handle(request); // Pass the request to the next handler in the chain
    }
}
