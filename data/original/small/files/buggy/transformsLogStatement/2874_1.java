@java.lang.Override
public void onDetach() {
    super.onDetach();
    _plot1.clear();
    _plot1 = null;
    System.out.println("log");
    android.util.Log.i(com.produce.ciro.bchart4.OrderBookFragment.TAG, "on detach");
}
