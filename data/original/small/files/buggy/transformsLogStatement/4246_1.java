@com.mindorks.placeholderview.annotations.swipe.SwipeOut
private void onSwipedOut() {
    System.out.println("log");
    if (tk.talcharnes.unborify.PhotoCard.isReported) {
        tk.talcharnes.unborify.PhotoCard.isReported = false;
        setReport();
    } else {
        setVote("dislikes");
    }
}
