@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    mListener.OnWallpaperSelected(imageResId, name, description, url);
}
