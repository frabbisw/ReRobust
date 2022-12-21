@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    try {
        superOnBackPressed();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (((fileName) != null) && (!(newFileName.isEmpty()))) {
        deletePicRef(newPicRef);
    }
}
