public void addTo(java.lang.String to) throws javax.mail.internet.AddressException {
    System.out.println("log");
    if ((this.to) == null) {
        this.to = new java.util.ArrayList<>();
    }
    this.cc.add(new javax.mail.internet.InternetAddress(to));
}
