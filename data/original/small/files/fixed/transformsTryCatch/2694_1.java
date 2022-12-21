protected void removeChild(org.jsoup.nodes.Node out) {
    org.jsoup.helper.Validate.isTrue(((out.parentNode) == (this)));
    int index = out.siblingIndex();
    childNodes.remove(index);
    try {
        reindexChildren(index);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.parentNode = null;
}
