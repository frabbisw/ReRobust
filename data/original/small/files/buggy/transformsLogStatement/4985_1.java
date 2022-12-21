@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if (!(mMultiSelector.isSelectable())) {
        folderInterface.openFolder(((com.example.abhilashmirji.virtualfileexplorer.FolderObject) (v.getTag())));
    }
}
