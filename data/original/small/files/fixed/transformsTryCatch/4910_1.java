@java.lang.Override
public void EventIDHolder(java.lang.String id) {
    try {
        receivedEventID = java.lang.Integer.parseInt(id);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
