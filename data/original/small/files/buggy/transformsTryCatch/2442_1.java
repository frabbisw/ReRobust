private void onMoreButtonClick(android.view.View v) {
    if (!(moreOptionOpen)) {
        moreOptionOpen = true;
    } else {
        moreOptionOpen = false;
    }
    try {
        moreBtnClick();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
