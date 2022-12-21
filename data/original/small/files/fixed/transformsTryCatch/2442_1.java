private void onMoreButtonClick(android.view.View v) {
    try {
        moreBtnClick();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(moreOptionOpen)) {
        moreOptionOpen = true;
    } else {
        moreOptionOpen = false;
    }
}
