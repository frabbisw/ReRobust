@java.lang.Override
public void onSuccess(com.google.firebase.storage.FileDownloadTask.TaskSnapshot taskSnapshot) {
    try {
        android.widget.Toast.makeText(this, "Transcript Download Complete", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mProgress.dismiss();
}
