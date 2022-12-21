private void detectTouchEventConsumed() {
    if (((footerLayoutParams.height) > (heightOfFooter)) || ((headerLayoutParams.height) > (heightOfActionBar))) {
        clearFocus();
        isTouchEventConsumed = true;
    } else {
        isTouchEventConsumed = false;
    }
}
