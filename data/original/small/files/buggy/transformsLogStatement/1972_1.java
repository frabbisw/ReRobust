@java.lang.Override
public void detachView() {
    System.out.println("log");
    mView = null;
    if (!(subscription.isUnsubscribed())) {
        subscription.unsubscribe();
    }
}
