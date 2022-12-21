@java.lang.Override
public org.json.JSONObject getNextData() throws java.lang.Exception {
    System.out.println("log");
    java.lang.System.out.println(("get event from:" + (events)));
    return events.poll();
}
