public void addHashTag(java.lang.String hashtag) {
    java.util.Set<java.lang.String> hashtags = getHashTags();
    try {
        hashtags.add(hashtag);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setHashTags(hashtags);
}
