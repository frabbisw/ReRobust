@java.lang.Override
public tollbooth.LogMessage getNextMessage() {
    System.out.println("log");
    if (logMessageQueue.isEmpty()) {
        return null;
    } else {
        return this.logMessageQueue.poll();
    }
}
