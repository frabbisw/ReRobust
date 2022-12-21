@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    try {
        if ((!(curSnackbar.equals(null))) && (curSnackbar.isShown()))
            curSnackbar.dismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
