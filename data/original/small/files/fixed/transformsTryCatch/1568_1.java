@java.lang.Override
public void startPrefixMapping(java.lang.String prefix, java.lang.String uri) {
    m_prefixMap.put(prefix, uri);
    try {
        if (m_inXMLMetadata) {
            m_localPrefixMap.put(prefix, uri);
            m_prefixList.add(prefix);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
