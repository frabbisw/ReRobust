@java.lang.Override
public void startPrefixMapping(java.lang.String prefix, java.lang.String uri) {
    try {
        m_prefixMap.addNamespace(prefix, uri);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (m_inXMLMetadata) {
        m_localPrefixMap.addNamespace(prefix, uri);
        m_prefixList.add(prefix);
    }
}
