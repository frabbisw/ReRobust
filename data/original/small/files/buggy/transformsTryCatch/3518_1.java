@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    superOnBackPressed();
    try {
        if (!(newFileName.isEmpty())) {
            deletePicRef(newPicRef);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
