@java.lang.Override
public void onImagesSelected(java.util.ArrayList<android.net.Uri> uriList) {
    selectedUriList = uriList;
    try {
        android.widget.Toast.makeText(this, ("length " + (uriList.size())), Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
