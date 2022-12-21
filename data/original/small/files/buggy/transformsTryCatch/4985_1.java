@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (!(mMultiSelector.isSelectable())) {
            folderInterface.openFolder(((com.example.abhilashmirji.virtualfileexplorer.FolderObject) (v.getTag())));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
