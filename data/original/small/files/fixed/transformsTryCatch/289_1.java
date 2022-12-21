@java.lang.Override
public void displayImage(android.content.Context context, java.lang.Object path, android.widget.ImageView imageView) {
    try {
        com.bumptech.glide.Glide.with(context).load(path).crossFade().into(imageView);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
