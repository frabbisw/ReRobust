@java.lang.Override
public void onClick(android.view.View v) {
    com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave customDialogChoiceFolderToSave = new com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave(getActivity(), mData);
    try {
        customDialogChoiceFolderToSave.onCreateDialog();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
