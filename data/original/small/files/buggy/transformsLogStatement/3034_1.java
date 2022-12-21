@java.lang.Override
public void onResume() {
    System.out.println("log");
    super.onDestroy();
    android.util.Log.i(com.playxiangqi.hoxchess.MainActivity.PlaceholderFragment.TAG, "onResume...");
    com.playxiangqi.hoxchess.MainActivity activity = ((com.playxiangqi.hoxchess.MainActivity) (getActivity()));
    activity.onBoardViewResume(activity);
}
