@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        android.util.Log.i(com.playxiangqi.hoxchess.MainActivity.PlaceholderFragment.TAG, "onResume...");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.playxiangqi.hoxchess.MainActivity activity = ((com.playxiangqi.hoxchess.MainActivity) (getActivity()));
    activity.onBoardViewResume(activity);
}
