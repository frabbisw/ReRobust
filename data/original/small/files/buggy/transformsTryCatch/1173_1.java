@java.lang.Override
public void openDataContextMenu(android.view.View view) {
    try {
        this.getActivity().openContextMenu(view);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
