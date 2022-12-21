public <T> void emit(java.lang.String event, T data) {
    try {
        mLoop.enqueue(new me.mneri.eloop.Loop.Event(this, event, data));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
