public void startNewSale(java.lang.String custId) {
    customer = db.findCustomer(custId);
    java.lang.System.out.println(((customer.getCustId()) + "Cash"));
    receipt = new PointOfSale.Receipt(customer);
    lineItem = new PointOfSale.LineItem[0];
}
