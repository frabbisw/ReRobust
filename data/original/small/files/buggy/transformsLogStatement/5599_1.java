@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    System.out.println("log");
    if ((!(curSnackbar.equals(null))) && (curSnackbar.isShown()))
        curSnackbar.dismiss();
}
