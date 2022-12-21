@butterknife.OnClick(value = R.id.view_helper_overlay_button)
void dismissOverlay() {
    System.out.println("log");
    ((android.view.ViewGroup) (getParent())).removeView(this);
}
