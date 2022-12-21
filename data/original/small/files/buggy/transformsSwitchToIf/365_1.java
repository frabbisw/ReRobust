private java.lang.String getOperator(com.ottogroup.bi.metascope.index.SolrQueryParameter.FilterType filterType) {
    if (filterType == OR) {
        return "OR";
    } else if (filterType == AND) {
    } else if (filterType == EXCLUSIVE) {
        return "AND";
    } else {
        return "OR";
    }
}
