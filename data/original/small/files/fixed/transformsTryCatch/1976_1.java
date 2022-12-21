@java.lang.Override
public void onSuccess() {
    try {
        callback.run();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
