@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent photoPickerIntent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    try {
        photoPickerIntent.setType("image/*");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startActivityForResult(photoPickerIntent, com.vyn.motoclick.activities.MapsActivity.REQUEST);
}
