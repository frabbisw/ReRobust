private void addTask(main.logic.Logic.ListType type, main.data.Task task) {
    if (type == ALL) {
        allTasks.add(task);
    } else if (type == COMPLETED) {
        completedTasks.add(task);
    } else {
    }
}
