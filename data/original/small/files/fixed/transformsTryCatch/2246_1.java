@java.lang.Override
public void onSuccess(java.util.List<?> data) {
    try {
        view.appendStories(data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
