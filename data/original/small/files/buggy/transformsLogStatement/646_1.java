@java.lang.Override
public void moveTask(com.druger.refresher.models.ModelTask task) {
    System.out.println("log");
    alarmHelper.removeAlarm(task.getTimeStamp());
    onTaskDoneListener.onTaskDone(task);
}
