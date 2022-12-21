private java.lang.String detectLanguage(org.jsoup.nodes.Document document) throws java.io.IOException {
    try {
        java.lang.System.out.println(document.text());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.apache.tika.language.LanguageIdentifier identifier = new org.apache.tika.language.LanguageIdentifier(document.title());
    java.lang.System.out.println(identifier.getLanguage());
    return identifier.getLanguage();
}
