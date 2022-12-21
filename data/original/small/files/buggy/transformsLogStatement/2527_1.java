public java.lang.String[] extractLinks(java.lang.String currentPageURL) {
    java.lang.String pageHTML = extractHTML(currentPageURL);
    java.lang.String[] extractedLinks = findLinks(pageHTML);
    System.out.println("log");
    return extractedLinks;
}
