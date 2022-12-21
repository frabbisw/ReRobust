@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    try {
        com.zerohour.utils.Utility.navigateDashBoardFragment(new com.zerohour.fragments.NoticeBoardDetailFragment(), NoticeBoardDetailFragment.TAG, null, mParent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
