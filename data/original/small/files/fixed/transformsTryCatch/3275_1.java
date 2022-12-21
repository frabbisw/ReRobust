public void elapseOneSecond(int time) {
    try {
        if ((getLine()) == 0)
            return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    HW1.Customer firstCustomer = customersInLine.get(0);
    if ((firstCustomer.waited()) <= 0)
        customerServed(firstCustomer, time);
}
