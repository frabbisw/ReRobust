@java.lang.Override
protected void onTopic(java.lang.String channel, java.lang.String topic, java.lang.String setBy, long date, boolean changed) {
    try {
        java.lang.System.out.println(("onTopic: " + topic));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onTopic(channel, topic, setBy, date, changed);
}
