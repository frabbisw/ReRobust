public <T> void emit(java.lang.String event, T data) {
    System.out.println("log");
    mLoop.enqueue(new me.mneri.eloop.Loop.Event(this, event, data));
}
