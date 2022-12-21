public static void display(final android.content.Context mContext, java.lang.String url, final android.widget.ImageView img) {
    try {
        com.bumptech.glide.Glide.with(mContext).load(url).dontAnimate().placeholder(com.xinyi.czbasedevtool.base.manager.ui_about.GlideMaster.placeHolderRes).error(com.xinyi.czbasedevtool.base.manager.ui_about.GlideMaster.errorHolderRes).into(img);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
