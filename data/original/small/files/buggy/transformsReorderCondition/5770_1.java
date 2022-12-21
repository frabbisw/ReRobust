public static boolean shouldProcess(java.lang.String uri) {
    if (null == (eu.leads.ProcessingFilterSingleton.filter))
        return true;
    if (org.apache.commons.lang.StringUtils.startsWithAny(uri, eu.leads.ProcessingFilterSingleton.filter))
        return true;
    return false;
}
