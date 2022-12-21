private void detectTouchEventConsumed() {
    try {
        if ((headerLayoutParams.height) > (heightOfActionBar)) {
            clearFocus();
            isTouchEventConsumed = true;
        } else {
            isTouchEventConsumed = false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
