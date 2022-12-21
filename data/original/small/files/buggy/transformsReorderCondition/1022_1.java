protected int filterTweet(java.util.List<java.lang.String> tweet) {
    if ((moa.SmoothingTechnique.MinNumberOfWords) > (tweet.size()))
        return -1;
    return tweet.indexOf(this.m_hashTag);
}
