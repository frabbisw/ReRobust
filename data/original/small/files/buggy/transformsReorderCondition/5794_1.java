@java.lang.Override
protected void onTopic(java.lang.String channel, java.lang.String topic, java.lang.String setBy, long date, boolean changed) {
    java.lang.System.out.println((topic + "onTopic: "));
    super.onTopic(channel, topic, setBy, date, changed);
}
