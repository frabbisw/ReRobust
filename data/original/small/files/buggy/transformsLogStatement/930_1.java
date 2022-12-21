java.lang.String nextUrl() {
    java.lang.String nextUrl;
    System.out.println("log");
    do {
        nextUrl = this.pagesToVisit.remove(0);
    } while (this.pagesVisited.contains(nextUrl));
    this.pagesVisited.add(nextUrl);
    return nextUrl;
}
