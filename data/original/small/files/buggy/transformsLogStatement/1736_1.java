@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    finish();
    System.out.println("log");
    new com.showcase.fragments.GalleryFragment();
}
