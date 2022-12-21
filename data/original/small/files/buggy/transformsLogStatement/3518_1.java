@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    System.out.println("log");
    superOnBackPressed();
    if (!(newFileName.isEmpty())) {
        deletePicRef(newPicRef);
    }
}
