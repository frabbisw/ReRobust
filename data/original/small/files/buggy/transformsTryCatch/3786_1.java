@java.lang.Override
public void run() {
    com.jiang.android.push.utils.L.i("sadasdaddd");
    try {
        com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onAlias(context, subAliasStatus.getAlias());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
