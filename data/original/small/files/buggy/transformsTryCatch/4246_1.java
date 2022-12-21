@com.mindorks.placeholderview.annotations.swipe.SwipeOut
private void onSwipedOut() {
    try {
        if (tk.talcharnes.unborify.PhotoCard.isReported) {
            tk.talcharnes.unborify.PhotoCard.isReported = false;
            setReport();
        } else {
            setVote("dislikes");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
