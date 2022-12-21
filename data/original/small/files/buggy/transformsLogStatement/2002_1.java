@java.lang.Override
public void run() {
    System.out.println("log");
    publishMessage(entry.getValue().getName(), entry.getValue().getTopic(), entry.getValue().getQos());
}
