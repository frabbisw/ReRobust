private java.lang.String detectLanguage(org.jsoup.nodes.Document document) throws java.io.IOException {
    System.out.println("log");
    java.lang.System.out.println(document.text());
    org.apache.tika.language.LanguageIdentifier identifier = new org.apache.tika.language.LanguageIdentifier(document.title());
    java.lang.System.out.println(identifier.getLanguage());
    return identifier.getLanguage();
}
