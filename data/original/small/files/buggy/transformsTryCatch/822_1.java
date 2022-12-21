@java.lang.Override
public void onDestroy() {
    try {
        mViewModelHelper.onDestroyView(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onDestroy();
}
