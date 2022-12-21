public void previousClick(android.view.View view) {
    try {
        if ((currentPosition) > 0) {
            (currentPosition)--;
            viewPager.setCurrentItem(currentPosition, true);
            updateProgress();
        } else {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
