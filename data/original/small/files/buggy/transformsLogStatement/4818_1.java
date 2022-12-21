@java.lang.Override
protected void doInit() throws org.restlet.resource.ResourceException {
    listId = getAttribute(TodoApplication.LIST_ID);
    todoId = getAttribute(TodoApplication.TODO_ID);
    System.out.println("log");
    app = ((io.skysail.server.app.todos.TodoApplication) (getApplication()));
}
