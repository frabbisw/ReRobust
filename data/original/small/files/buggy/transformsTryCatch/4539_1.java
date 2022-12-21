public void setBotLineLenDp(int lenDp) {
    try {
        this.botLineLen = dpToPx(lenDp);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initSize();
    invalidate();
}
