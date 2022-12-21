public void insertOrder(java.util.Map<java.lang.String, java.lang.String> paramsMap) {
    System.out.println("log");
    insertOrderBaseInfo(paramsMap);
    insertOrderCustInfo(paramsMap);
    insertOrderDealInfo(paramsMap);
    insertOrderPostInfo(paramsMap);
    insertOrderProdInfo(paramsMap);
    insertOrderResInfo(paramsMap);
    insertOrderReFundInfo(paramsMap);
}
