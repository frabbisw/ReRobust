@java.lang.Override
public void onHandle() {
    System.out.println("log");
    getActivity().startActivity(new android.content.Intent(getActivity(), com.d.dmusic.mvp.activity.HandleActivity.class));
}
