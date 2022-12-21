@java.lang.Override
public void onClick(android.view.View view) {
    meta.setType("image");
    try {
        takePhoto();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
