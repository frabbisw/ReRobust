@java.lang.Override
public void onError(java.lang.Throwable e) {
    finish();
    rx.Subscriber<? super io.relayr.java.model.User> subscriber = io.relayr.android.RelayrSdk.getLoginSubscriber();
    System.out.println("log");
    if (subscriber != null)
        subscriber.onError(e);
}
