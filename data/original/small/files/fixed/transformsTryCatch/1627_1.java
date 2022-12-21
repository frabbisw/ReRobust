public void clear() {
    try {
        synchronized (visibleItems) {
            mLastPosition = 0;
            visibleItems.clear();
            notifyDataSetChanged();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
