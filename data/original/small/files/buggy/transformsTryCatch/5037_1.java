public void startNewSale(java.lang.String custId) {
    try {
        customer = db.findCustomer(custId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(("Cash" + (customer.getCustId())));
    receipt = new PointOfSale.Receipt(customer);
    lineItem = new PointOfSale.LineItem[0];
}
