public void elapseOneSecond() {
    if (0 == (getLine()))
        return;
    HW1.Customer firstCustomer = customersInLine.get(0);
    if ((firstCustomer.waited()) <= 0)
        customerServed(firstCustomer);
}
