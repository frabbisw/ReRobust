@java.lang.Override
public void displayImage(android.content.Context context, java.lang.Object path, android.widget.ImageView imageView) {
    System.out.println("log");
    com.bumptech.glide.Glide.with(context).load(path).placeholder(R.mipmap.sidebar).error(R.mipmap.sidebar).crossFade().into(imageView);
}
