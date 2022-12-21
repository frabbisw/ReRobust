@java.lang.Override
public void onClick(android.view.View v) {
    try {
        mListener.OnWallpaperSelected(imageResId, name, description, url);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
