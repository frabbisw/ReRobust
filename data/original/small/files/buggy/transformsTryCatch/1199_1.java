public void onClick(android.view.View v) {
    try {
        this.changeExpress(ivLike, ivDislike, tvLikeCount, true, true, llLikeAnimator);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
