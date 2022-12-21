public void withMaxResultSize(@android.support.annotation.IntRange(from = 100) int width, @android.support.annotation.IntRange(from = 100) int height) {
    mOptionBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_X, width);
    try {
        mOptionBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_Y, height);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
