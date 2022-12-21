public void setCompletedPosition(int position) {
    mCompletedPosition = position;
    try {
        invalidate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
