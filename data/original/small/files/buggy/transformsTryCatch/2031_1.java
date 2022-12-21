@java.lang.Override
public org.json.JSONObject getNextData() throws java.lang.Exception {
    try {
        java.lang.System.out.println(("get event from:" + (events)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return events.poll();
}
