@java.lang.Override
public void run() {
    try {
        publishMessage(entry.getValue().getName(), entry.getValue().getTopic(), entry.getValue().getQos());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
