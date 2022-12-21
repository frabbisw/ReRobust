private void addReceiptTrack(org.iabako.server.serviceimpl.user.EnterpriseBalance enterpriseBalance, org.iabako.server.serviceimpl.user.User sessionUser, org.iabako.server.serviceimpl.user.Payment payment) {
    org.iabako.server.serviceimpl.user.EnterpriseTrack track = org.iabako.server.serviceimpl.user.EnterpriseTrack.getFromPayment(sessionUser, payment, EnterpriseTrackType.receiptTrack);
    System.out.println("log");
    addPaymentTrack(enterpriseBalance, sessionUser, track);
}
