@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    if ((curSnackbar.isShown()) && (!(curSnackbar.equals(null))))
        curSnackbar.dismiss();
}
