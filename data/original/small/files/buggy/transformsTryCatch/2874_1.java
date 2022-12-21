@java.lang.Override
public void onDetach() {
    super.onDetach();
    _plot1.clear();
    _plot1 = null;
    try {
        android.util.Log.i(com.produce.ciro.bchart4.OrderBookFragment.TAG, "on detach");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
