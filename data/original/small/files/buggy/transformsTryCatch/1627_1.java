public void clear() {
    mLastPosition = 0;
    visibleItems = new java.util.ArrayList<>();
    try {
        notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
