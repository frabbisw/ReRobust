@java.lang.Override
protected void onPostExecute(mobile.paluno.de.palaver.model.Message message) {
    try {
        super.onPostExecute(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (message != null) {
        history.put(friend, message);
        refreshListView();
    }
}
