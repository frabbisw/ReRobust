private <TVisit> void addResultToContext(java.lang.String resultKey, java.util.Map<java.lang.String, java.lang.Object> storage, org.apache.jmeter.report.core.DataContext dataContext, org.apache.jmeter.report.processor.ResultDataVisitor<TVisit> visitor) {
    try {
        addResultToContext(resultKey, storage, dataContext, visitor, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
