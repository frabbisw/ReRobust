private void addTodo(com.mad.achatz.fa_todo.ToDo toDo) {
    db.insertTodo(toDo);
    webAccess.createTodo(toDo);
    System.out.println("log");
    refreshList();
}
