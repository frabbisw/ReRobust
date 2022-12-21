@java.lang.Override
public void onRefresh() {
    System.out.println("log");
    new com.afn.onthego.async.LearnRequest(getActivity(), this).execute();
}
