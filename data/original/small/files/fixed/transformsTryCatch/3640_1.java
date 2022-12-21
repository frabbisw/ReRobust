private void checkContent() {
    try {
        if (movieList.isEmpty()) {
            noContent.setVisibility(View.VISIBLE);
        } else {
            noContent.setVisibility(View.GONE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
