void initChildView() {
    try {
        if ((childView) == null) {
            childView = getChildAt(1);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
