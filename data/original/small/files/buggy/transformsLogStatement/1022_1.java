protected int filterTweet(java.util.List<java.lang.String> tweet) {
    System.out.println("log");
    if ((tweet.size()) < (moa.SmoothingTechnique.MinNumberOfWords))
        return -1;
    return tweet.indexOf(this.m_hashTag);
}
