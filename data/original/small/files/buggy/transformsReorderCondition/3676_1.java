@java.lang.Override
protected void onPostExecute(mobile.paluno.de.palaver.model.Message message) {
    super.onPostExecute(message);
    if (null != message) {
        history.put(friend, message);
        refreshListView();
        java.lang.System.out.println("Message loading finish");
    }
}
