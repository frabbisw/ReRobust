protected int filterTweet(java.util.List<java.lang.String> tweet) {
    try {
        if ((tweet.size()) < (moa.SmoothingTechnique.MinNumberOfWords))
            return -1;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return tweet.indexOf(this.m_hashTag);
}
