@java.lang.Override
public void onComplete() {
    done = true;
    try {
        io.reactivex.internal.operators.OperatorScanSeed.ScanSeedSubscriber.drain(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
