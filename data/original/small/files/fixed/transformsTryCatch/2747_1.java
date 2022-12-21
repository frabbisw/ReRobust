@java.lang.Override
public tollbooth.LogMessage getNextMessage() {
    try {
        if (logMessageQueue.isEmpty()) {
            return null;
        } else {
            return logMessageQueue.poll();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
