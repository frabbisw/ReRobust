@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    bundle = new android.os.Bundle();
    try {
        bundle.putInt("position", position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
