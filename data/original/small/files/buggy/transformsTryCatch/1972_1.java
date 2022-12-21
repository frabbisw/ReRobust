@java.lang.Override
public void detachView() {
    mView = null;
    try {
        if (!(subscription.isUnsubscribed())) {
            subscription.unsubscribe();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
