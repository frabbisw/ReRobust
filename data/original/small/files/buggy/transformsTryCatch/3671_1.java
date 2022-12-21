private void createAndSendMessage(java.lang.String recipients, java.lang.StringBuilder resultingHtml) {
    java.lang.String subject = "Monthly department salary report";
    javax.mail.internet.MimeMessage resultMessage = mailSender.createMessageWithHTMLCode(recipients, resultingHtml.toString(), subject);
    try {
        mailSender.sendMessage(resultMessage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
