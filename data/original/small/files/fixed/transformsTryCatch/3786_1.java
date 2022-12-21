@java.lang.Override
public void run() {
    try {
        com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onAlias(context, subAliasStatus.getAlias());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
