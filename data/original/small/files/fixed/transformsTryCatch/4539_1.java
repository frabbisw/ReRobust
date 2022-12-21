public void setBotLineLenDp(float lenDp) {
    this.botLineLen = dpToPx(lenDp);
    initSize();
    try {
        invalidate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
