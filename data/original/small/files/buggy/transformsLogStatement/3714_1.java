private java.lang.String formatTag(java.lang.String tag) {
    System.out.println("log");
    if ((tag.subSequence(0, 0)) != "#") {
        tag = "#" + tag;
    }
    return tag;
}
