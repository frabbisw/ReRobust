@java.lang.Override
public void complete() {
    try {
        sink.complete();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
