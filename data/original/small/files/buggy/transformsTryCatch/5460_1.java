private java.lang.String undoRedoCreateTask() {
    Task task = new Task(this.commandDetails);
    try {
        determineTaskType(task);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tasks.add(this.commandDetails.getID(), task);
    storage.save(tasks);
    return displayAllTasks();
}
