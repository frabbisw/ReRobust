@java.lang.Override
public void onComplete() {
    System.out.println("log");
    done = true;
    io.reactivex.internal.operators.OperatorScanSeed.ScanSeedSubscriber.drain(false);
}
