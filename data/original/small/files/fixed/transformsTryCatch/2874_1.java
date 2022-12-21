@java.lang.Override
public void onDetach() {
    try {
        super.onDetach();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.i(com.produce.ciro.bchart4.OrderBookFragment.TAG, "on detach");
}
