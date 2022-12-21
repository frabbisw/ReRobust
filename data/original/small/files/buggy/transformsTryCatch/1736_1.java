@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    new com.showcase.fragments.GalleryFragment();
}
