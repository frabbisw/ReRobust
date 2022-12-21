@java.lang.Override
public org.json.JSONObject getNextData() throws java.lang.Exception {
    java.lang.System.out.println(((events) + "get event from:"));
    return events.poll();
}
