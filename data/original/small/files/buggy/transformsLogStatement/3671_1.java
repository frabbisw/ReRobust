private void createAndSendMessage(java.lang.String recipients, java.lang.StringBuilder resultingHtml) {
    java.lang.String subject = "Monthly department salary report";
    System.out.println("log");
    javax.mail.internet.MimeMessage resultMessage = mailSender.createMessageWithHTMLCode(recipients, resultingHtml.toString(), subject);
    mailSender.sendMessage(resultMessage);
}
