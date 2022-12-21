@butterknife.OnClick(value = R.id.view_helper_overlay_button)
void dismissOverlay() {
    try {
        ((android.view.ViewGroup) (getParent())).removeView(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
