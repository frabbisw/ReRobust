@java.lang.Override
public boolean run(seedu.jimi.model.task.ReadOnlyTask task) {
    System.out.println("log");
    if (checkCompleted) {
        if (!(task.isCompleted())) {
            return false;
        }
    }
    return (task instanceof seedu.jimi.model.task.DeadlineTask) || (task instanceof seedu.jimi.model.task.FloatingTask);
}
