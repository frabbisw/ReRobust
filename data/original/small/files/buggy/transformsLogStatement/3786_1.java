@java.lang.Override
public void run() {
    com.jiang.android.push.utils.L.i("sadasdaddd");
    System.out.println("log");
    com.jiang.android.push.flyme.FlymeReceiver.mPushInterface.onAlias(context, subAliasStatus.getAlias());
}
