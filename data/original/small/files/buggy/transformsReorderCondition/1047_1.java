public static synchronized taskr.se.taskr.repository.TaskRContentProviderImpl getInstance(android.content.Context context) {
    if (null == (taskr.se.taskr.repository.TaskRContentProviderImpl.instance)) {
        taskr.se.taskr.repository.TaskRContentProviderImpl.instance = new taskr.se.taskr.repository.TaskRContentProviderImpl(context, new taskr.se.taskr.repository.RefreshItemsListener() {

            @java.lang.Override
            public void refreshItems() {
            }
        });
    }
    return taskr.se.taskr.repository.TaskRContentProviderImpl.instance;
}
