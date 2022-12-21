public void previousClick(android.view.View view) {
    (currentPosition)--;
    viewPager.setCurrentItem(currentPosition, true);
    try {
        updateProgress();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
