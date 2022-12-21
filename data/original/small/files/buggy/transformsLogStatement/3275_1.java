public void elapseOneSecond() {
    if ((getLine()) == 0)
        return;
    HW1.Customer firstCustomer = customersInLine.get(0);
    System.out.println("log");
    if ((firstCustomer.waited()) <= 0)
        customerServed(firstCustomer);
}
