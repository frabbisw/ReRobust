java.lang.String nextUrl() {
    java.lang.String nextUrl;
    do {
        nextUrl = this.pagesToVisit.remove(0);
    } while (this.pagesVisited.contains(nextUrl));
    try {
        this.pagesVisited.add(nextUrl);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return nextUrl;
}
