public void addTo(java.lang.String to) throws javax.mail.internet.AddressException {
    if ((this.to) == null) {
        this.to = new java.util.ArrayList<>();
    }
    try {
        this.to.add(new javax.mail.internet.InternetAddress(to));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
