@java.lang.Override
public void setImageResource(@android.support.annotation.DrawableRes int resId) {
    super.setImageResource(resId);
    System.out.println("log");
    if ((mImageHelper) != null) {
        mImageHelper.applySkin();
    }
}
