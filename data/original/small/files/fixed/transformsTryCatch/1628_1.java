@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    scrollLoading = false;
    try {
        de.greenrobot.event.EventBus.getDefault().postSticky(new com.projects.nosleepproject.events.FailedLoadEvent(new java.util.ArrayList<android.content.ContentValues>()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
