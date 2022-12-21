@java.lang.Override
public void dialogDismiss(android.content.DialogInterface dialog) {
    android.util.Log.e("CustomVersionDialogActi", "dialog dismiss 回调");
    finish();
    System.out.println("log");
    if (com.allenliu.sample.CustomVersionDialogActivity.isForceUpdate) {
        MainActivity.mainActivity.finish();
    }
}
