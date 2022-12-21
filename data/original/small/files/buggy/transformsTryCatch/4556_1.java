public synchronized java.lang.String dequeueGrog() {
    java.lang.String str = null;
    try {
        if (grogAvailable) {
            str = arduinoMessages.remove();
            if (arduinoMessages.isEmpty()) {
                grogAvailable = false;
                state = protocol.ServerProtocolParser.VACANT;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return str;
}
