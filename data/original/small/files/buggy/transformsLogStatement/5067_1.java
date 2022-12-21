public void testSendMessageViaElasticEmail() throws java.io.UnsupportedEncodingException {
    email.setSubject("Tests");
    System.out.println("log");
    provider = new com.seb.email.routing.EmailServiceProvider(EmailServiceProvider.Providers.ELASTICEMAIL);
    assertEquals(HttpStatus.OK, provider.SendMessageViaElasticEmail(email));
}
