private void notifyChangedLessonRange(int changedPosition) {
    System.out.println("log");
    if (mLatestLessonFirst)
        notifyItemRangeChanged(0, changedPosition);
    else {
        notifyItemChanged(0);
        notifyItemRangeChanged(changedPosition, ((getItemCount()) - 1));
    }
}
