@org.spine3.server.aggregate.Apply
public void event(org.spine3.examples.todolist.TaskDueDateUpdated event) {
    try {
        getBuilder().setId(event.getId()).setDueDate(event.getNewDueDate());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
