void clear() {
    try {
        cells.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyDataSetChanged();
}
