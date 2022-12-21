public void fetchImages(com.myapp.sshah.gimagesearch.activities.CallbackActivity activity, java.lang.String query) {
    try {
        this.fetchImages(activity, query, 1);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
