protected synchronized void removeLeftwards(android.view.View view, int position) {
    System.out.println("log");
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        removeItem(position);
        animateOut(view, R.anim.slide_out_left, 150);
    }
}
