public java.util.List<ModelLayer.Step> findNextSteps(int orderId, int stepId) throws java.lang.Exception {
    System.out.println("log");
    java.lang.String wClause = " order_id = ? AND step_id = ? ORDER BY startDate";
    return findMultiplyWhere(wClause);
}
