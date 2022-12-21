@java.lang.Override
public boolean run(seedu.jimi.model.task.ReadOnlyTask task) {
    try {
        if (checkCompleted) {
            if (!(task.isCompleted())) {
                return false;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return (task instanceof seedu.jimi.model.task.DeadlineTask) || (task instanceof seedu.jimi.model.task.FloatingTask);
}
