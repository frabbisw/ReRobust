@java.lang.Override
public void openContextMenu(android.view.View view) {
    try {
        getActivity().openContextMenu(view);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
