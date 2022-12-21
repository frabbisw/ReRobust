@java.lang.Override
protected void doInit() throws org.restlet.resource.ResourceException {
    try {
        listId = getAttribute(TodoApplication.LIST_ID);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    todoId = getAttribute(TodoApplication.TODO_ID);
    app = ((io.skysail.server.app.todos.TodoApplication) (getApplication()));
}
