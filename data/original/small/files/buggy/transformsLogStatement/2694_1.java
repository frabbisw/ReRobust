protected void removeChild(org.jsoup.nodes.Node out) {
    org.jsoup.helper.Validate.isTrue(((out.parentNode) == (this)));
    System.out.println("log");
    int index = out.siblingIndex();
    childNodes.remove(index);
    reindexChildren();
    out.parentNode = null;
}
