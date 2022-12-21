@java.lang.Override
public void onRefresh() {
    try {
        new com.afn.onthego.async.LearnRequest(getActivity(), this).execute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
