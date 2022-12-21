public void addContact(java.lang.String name, java.lang.String address, java.lang.String phone) {
    try {
        cl.addContact(name, address, phone);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
