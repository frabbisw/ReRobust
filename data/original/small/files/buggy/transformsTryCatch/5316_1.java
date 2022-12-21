private void addTodo(com.mad.achatz.fa_todo.ToDo toDo) {
    db.insertTodo(toDo);
    try {
        webAccess.createTodo(toDo);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    refreshList();
}
