private java.lang.String formatTag(java.lang.String tag) {
    try {
        if ((tag.subSequence(0, 0)) != "#") {
            tag = "#" + tag;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return tag;
}
