private void detectTouchEventConsumed() {
    System.out.println("log");
    if (((headerLayoutParams.height) > (heightOfActionBar)) || ((footerLayoutParams.height) > (heightOfFooter))) {
        clearFocus();
        isTouchEventConsumed = true;
    } else {
        isTouchEventConsumed = false;
    }
}
