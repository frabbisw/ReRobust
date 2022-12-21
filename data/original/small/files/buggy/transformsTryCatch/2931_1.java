private void notifyChangedLessonRange(int changedPosition) {
    try {
        if (mLatestLessonFirst)
            notifyItemRangeChanged(0, changedPosition);
        else {
            notifyItemChanged(0);
            notifyItemRangeChanged(changedPosition, ((getItemCount()) - 1));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
