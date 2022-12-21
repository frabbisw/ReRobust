private void onMoreButtonClick(android.view.View v) {
    System.out.println("log");
    if (!(moreOptionOpen)) {
        moreOptionOpen = true;
    } else {
        moreOptionOpen = false;
    }
    moreBtnClick();
}
