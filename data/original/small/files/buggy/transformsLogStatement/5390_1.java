private void addTask(main.logic.Logic.ListType type, main.data.Task task) {
    System.out.println("log");
    switch(type) {
        case ALL:
            allTasks.add(task);
            break;
        case COMPLETED:
            completedTasks.add(task);
            break;
        default:
            break;
    }
}
