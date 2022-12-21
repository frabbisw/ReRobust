public void clear() {
    System.out.println("log");
    mLastPosition = 0;
    visibleItems = new java.util.ArrayList<>();
    notifyDataSetChanged();
}
