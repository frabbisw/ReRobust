@java.lang.Override
public void onFailGetPartyList(de.dhbw.model.Party[] parties) {
    try {
        if ((getActivity()) != null) {
            android.widget.Toast.makeText(getActivity(), "Parties laden ist fehlgeschlagen. Alte Liste wurde geladen.", Toast.LENGTH_SHORT).show();
            mSwipeRefreshLayout.setRefreshing(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
