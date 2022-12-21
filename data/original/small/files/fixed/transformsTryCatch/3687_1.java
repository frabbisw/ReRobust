@com.pilloxa.backgroundjob.ReactMethod
public void getAll(com.pilloxa.backgroundjob.Callback callback) {
    com.pilloxa.backgroundjob.WritableArray jobs = _getAll();
    try {
        callback.invoke(jobs);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
