private com.airamerica.customer.Customer findCustomer(java.lang.String customerCode) {
    for (com.airamerica.customer.Customer c : customers) {
        if (customerCode == (c.getCode())) {
            return c;
        }
    }
    return null;
}
