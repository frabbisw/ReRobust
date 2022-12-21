@java.lang.Override
public void moveTask(com.druger.refresher.models.ModelTask task) {
    alarmHelper.removeAlarm(task.getTimeStamp());
    try {
        onTaskDoneListener.onTaskDone(task);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
