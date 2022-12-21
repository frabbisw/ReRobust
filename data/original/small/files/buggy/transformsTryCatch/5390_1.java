private void addTask(main.logic.Logic.ListType type, main.data.Task task) {
    try {
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
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
