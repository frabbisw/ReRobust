protected void removeChild(org.jsoup.nodes.Node out) {
    org.jsoup.helper.Validate.isTrue(((this) == (out.parentNode)));
    int index = out.siblingIndex();
    childNodes.remove(index);
    reindexChildren();
    out.parentNode = null;
}
