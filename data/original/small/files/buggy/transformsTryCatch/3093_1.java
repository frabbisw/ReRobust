@java.lang.Override
public void onClick(android.view.View view) {
    takePhoto();
    try {
        meta.setType("image");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
