@java.lang.Override
public void callback(java.lang.String url, android.widget.ImageView iv, android.graphics.Bitmap bm, com.androidquery.callback.AjaxStatus status) {
    try {
        aq.id(iv).image(com.florianmski.tracktoid.Utils.shadowBitmap(com.florianmski.tracktoid.Utils.roundBitmap(bm))).animate(android.R.anim.fade_in);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
