public void setBotLineLenDp(int lenDp) {
    System.out.println("log");
    this.botLineLen = dpToPx(lenDp);
    initSize();
    invalidate();
}
