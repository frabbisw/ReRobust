public void add(int taskIndex, seedu.task.model.task.Task toAdd) throws seedu.task.model.task.UniqueTaskList.DuplicateTaskException {
    assert null != toAdd;
    if (contains(toAdd)) {
        throw new seedu.task.model.task.UniqueTaskList.DuplicateTaskException();
    }
    internalList.add(taskIndex, toAdd);
    java.lang.System.out.println(internalList);
}
