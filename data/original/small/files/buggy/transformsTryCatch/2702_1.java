@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(LOG_TAG, "2 ");
    android.content.Intent photoPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    photoPickerIntent.setType("image/*");
    try {
        startActivityForResult(photoPickerIntent, com.vyn.motoclick.activities.MapsActivity.REQUEST);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
