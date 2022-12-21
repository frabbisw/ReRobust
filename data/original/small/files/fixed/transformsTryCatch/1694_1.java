public void emit(java.lang.String event, java.lang.Object data) {
    try {
        mLoop.enqueue(new me.mneri.eloop.Loop.Event(this, event, data));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
