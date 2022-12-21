@java.lang.Override
public void onResume() {
    super.onDestroy();
    android.util.Log.i(com.playxiangqi.hoxchess.MainActivity.PlaceholderFragment.TAG, "onResume...");
    com.playxiangqi.hoxchess.MainActivity activity = ((com.playxiangqi.hoxchess.MainActivity) (getActivity()));
    try {
        activity.onBoardViewResume(activity);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
