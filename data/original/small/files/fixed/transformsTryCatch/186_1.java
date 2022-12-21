@butterknife.OnClick(value = R.id.label_touch_target)
public void labelTouch() {
    if (mResolutionLayoutVisible) {
        return;
    }
    try {
        finishWithResult("label");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
