@java.lang.Override
public void setImageResource(@android.support.annotation.DrawableRes int resId) {
    try {
        super.setImageResource(resId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mImageHelper) != null) {
        mImageHelper.applySkin();
    }
}
