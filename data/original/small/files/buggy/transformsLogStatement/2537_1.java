public void previousClick(android.view.View view) {
    (currentPosition)--;
    viewPager.setCurrentItem(currentPosition, true);
    System.out.println("log");
    updateProgress();
}
