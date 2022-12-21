@java.lang.Override
public void onHandle() {
    try {
        getActivity().startActivity(new android.content.Intent(getActivity(), com.d.dmusic.mvp.activity.HandleActivity.class));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
