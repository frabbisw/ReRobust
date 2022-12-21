public void insertOrder(java.util.Map<java.lang.String, java.lang.String> paramsMap) {
    insertOrderBaseInfo(paramsMap);
    insertOrderCustInfo(paramsMap);
    insertOrderDealInfo(paramsMap);
    insertOrderPostInfo(paramsMap);
    try {
        insertOrderProdInfo(paramsMap);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    insertOrderResInfo(paramsMap);
}
