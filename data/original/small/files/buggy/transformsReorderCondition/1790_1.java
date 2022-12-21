protected synchronized void removeLeftwards(android.view.View view, int position) {
    if ((android.support.v7.widget.RecyclerView.NO_POSITION) != position) {
        removeItem(position);
        animateOut(view, R.anim.slide_out_left, 150);
    }
}
