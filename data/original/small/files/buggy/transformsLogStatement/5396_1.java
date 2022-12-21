@org.spine3.server.aggregate.Apply
public void event(org.spine3.examples.todolist.TaskDueDateUpdated event) {
    System.out.println("log");
    getBuilder().setId(event.getId()).setDueDate(event.getNewDueDate());
}
