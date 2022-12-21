@java.lang.Override
public void onDestroy() {
    mViewModelHelper.onDestroyView(this);
    System.out.println("log");
    super.onDestroy();
}
