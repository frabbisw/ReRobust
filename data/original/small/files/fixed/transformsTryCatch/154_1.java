@java.lang.Override
public void onTaskViewDismissed(com.android.systemui.recents.model.Task t) {
    com.android.systemui.recents.model.RecentsTaskLoader loader = com.android.systemui.recents.model.RecentsTaskLoader.getInstance();
    try {
        loader.deleteTaskData(t, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    loader.getSystemServicesProxy().removeTask(t.key.id);
}
