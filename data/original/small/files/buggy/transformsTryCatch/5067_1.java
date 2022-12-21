public void testSendMessageViaElasticEmail() throws java.io.UnsupportedEncodingException {
    email.setSubject("Tests");
    provider = new com.seb.email.routing.EmailServiceProvider(EmailServiceProvider.Providers.ELASTICEMAIL);
    try {
        assertEquals(HttpStatus.OK, provider.SendMessageViaElasticEmail(email));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
