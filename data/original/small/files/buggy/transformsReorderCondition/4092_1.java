public void addTo(java.lang.String to) throws javax.mail.internet.AddressException {
    if (null == (this.to)) {
        this.to = new java.util.ArrayList<>();
    }
    this.cc.add(new javax.mail.internet.InternetAddress(to));
}
