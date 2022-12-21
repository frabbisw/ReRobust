private java.lang.String formatTag(java.lang.String tag) {
    try {
        if (!(tag.startsWith("#"))) {
            tag = "#" + tag;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return tag;
}
