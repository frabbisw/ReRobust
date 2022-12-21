public de.uniks.networkparser.xml.XMLEntity withValue(java.lang.String value) {
    de.uniks.networkparser.xml.XMLTokener tokener = new de.uniks.networkparser.xml.XMLTokener();
    try {
        tokener.withBuffer(value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tokener.skipHeader();
    withValue(tokener);
    return this;
}
