@java.lang.Override
protected void onPostExecute(mobile.paluno.de.palaver.model.Message message) {
    System.out.println("log");
    super.onPostExecute(message);
    if (message != null) {
        history.put(friend, message);
        refreshListView();
        java.lang.System.out.println("Message loading finish");
    }
}
