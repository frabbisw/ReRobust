@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    try {
        super.onActivityCreated(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.setListAdapter(new com.group.cs.wi_free.DeviceListFragment.WifiPeerListAdapter(getActivity(), R.layout.row_devices, peers));
}
