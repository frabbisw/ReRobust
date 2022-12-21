@java.lang.Override
protected void onTopic(java.lang.String channel, java.lang.String topic, java.lang.String setBy, long date, boolean changed) {
    System.out.println("log");
    java.lang.System.out.println(("onTopic: " + topic));
    super.onTopic(channel, topic, setBy, date, changed);
}
