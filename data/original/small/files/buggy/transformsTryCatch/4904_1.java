private void detectTouchEventConsumed() {
    try {
        if (((headerLayoutParams.height) > (heightOfActionBar)) || ((footerLayoutParams.height) > (heightOfFooter))) {
            clearFocus();
            isTouchEventConsumed = true;
        } else {
            isTouchEventConsumed = false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
