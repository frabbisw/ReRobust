@java.lang.Override
public void setImageResource(@android.support.annotation.DrawableRes int resId) {
    super.setImageResource(resId);
    if (null != (mImageHelper)) {
        mImageHelper.applySkin();
    }
}
