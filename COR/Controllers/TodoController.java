package COR.Controllers;

import COR.Handlers.BodyHandler;

public class TodoController {
    private void createTodo() {
        // Logic to create a new todo item
        RequestHandler requestHandler = new AuthenticationHandler(new AuthorixationHandler(new BodyHandler(null)));
        System.out.println("Creating a new todo item.");

    }
}
