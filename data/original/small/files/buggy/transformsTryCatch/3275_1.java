public void elapseOneSecond() {
    if ((getLine()) == 0)
        return;
    HW1.Customer firstCustomer = customersInLine.get(0);
    try {
        if ((firstCustomer.waited()) <= 0)
            customerServed(firstCustomer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
