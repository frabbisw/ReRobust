@java.lang.Override
public void onSuccess(java.util.List<?> objects) {
    try {
        view.appendStories(data);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
