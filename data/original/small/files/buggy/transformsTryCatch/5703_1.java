@java.lang.SuppressWarnings(value = "unused")
@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onOfflineSubscriptionPosted(no.dnt.sjekkut.event.OfflineSubscriptionPosted event) {
    try {
        fetchUserStats();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    no.dnt.sjekkut.Utils.showInfoToast(this, ("Posted offline subscription, got code: " + (event.mResponse.code())));
}
