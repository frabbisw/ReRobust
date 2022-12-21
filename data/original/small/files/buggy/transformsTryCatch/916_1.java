private com.airamerica.customer.Customer findCustomer(java.lang.String customerCode) {
    try {
        for (com.airamerica.customer.Customer c : customers) {
            if ((c.getCode()) == customerCode) {
                return c;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
