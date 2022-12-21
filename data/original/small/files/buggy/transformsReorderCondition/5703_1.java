@java.lang.SuppressWarnings(value = "unused")
@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onOfflineSubscriptionPosted(no.dnt.sjekkut.event.OfflineSubscriptionPosted event) {
    fetchUserStats();
    no.dnt.sjekkut.Utils.showInfoToast(this, ((event.mResponse.code()) + "Posted offline subscription, got code: "));
}
