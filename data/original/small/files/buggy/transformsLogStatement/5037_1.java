public void startNewSale(java.lang.String custId) {
    customer = db.findCustomer(custId);
    System.out.println("log");
    java.lang.System.out.println(("Cash" + (customer.getCustId())));
    receipt = new PointOfSale.Receipt(customer);
    lineItem = new PointOfSale.LineItem[0];
}
