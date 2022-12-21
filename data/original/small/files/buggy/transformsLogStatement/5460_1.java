private java.lang.String undoRedoCreateTask() {
    Task task = new Task(this.commandDetails);
    determineTaskType(task);
    System.out.println("log");
    tasks.add(this.commandDetails.getID(), task);
    storage.save(tasks);
    return displayAllTasks();
}
