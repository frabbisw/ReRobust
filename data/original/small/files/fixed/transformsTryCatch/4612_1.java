public void populateTopicList(com.ChewieLouie.Topical.View.ViewTopicListIfc view) {
    try {
        view.populateTopicList(watchedTopics.values());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
