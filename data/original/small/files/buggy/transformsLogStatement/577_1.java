public void addHashTag(java.lang.String hashtag) {
    System.out.println("log");
    java.util.Set<java.lang.String> hashtags = getHashTags();
    hashtags.add(hashtag);
    setHashTags(hashtags);
}
