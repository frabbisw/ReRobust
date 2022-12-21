public static boolean shouldProcess(java.lang.String uri) {
    if ((eu.leads.ProcessingFilterSingleton.filter) == null)
        return true;
    try {
        if (org.apache.commons.lang.StringUtils.startsWithAny(uri, eu.leads.ProcessingFilterSingleton.filter))
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
