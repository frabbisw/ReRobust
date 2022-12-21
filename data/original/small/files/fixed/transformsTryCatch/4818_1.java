@java.lang.Override
protected void doInit() throws org.restlet.resource.ResourceException {
    super.doInit();
    listId = getAttribute(TodoApplication.LIST_ID);
    todoId = getAttribute(TodoApplication.TODO_ID);
    try {
        app = ((io.skysail.server.app.todos.TodoApplication) (getApplication()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
