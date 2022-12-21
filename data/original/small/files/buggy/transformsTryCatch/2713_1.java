void initChildView() {
    try {
        if ((childView) == null) {
            childView = getChildAt(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
