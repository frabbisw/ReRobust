@java.lang.Override
public boolean performLongClick() {
    if (null != (mLongListener)) {
        return mLongListener.onLongClick(this);
    }
    return false;
}
