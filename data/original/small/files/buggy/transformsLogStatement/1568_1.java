@java.lang.Override
public void startPrefixMapping(java.lang.String prefix, java.lang.String uri) {
    System.out.println("log");
    m_prefixMap.addNamespace(prefix, uri);
    if (m_inXMLMetadata) {
        m_localPrefixMap.addNamespace(prefix, uri);
        m_prefixList.add(prefix);
    }
}
