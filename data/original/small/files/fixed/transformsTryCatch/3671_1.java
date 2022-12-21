private void createAndSendMessage(java.lang.String recipients, java.lang.StringBuilder resultingHtml) {
    java.lang.String subject = "Monthly department salary report";
    javax.mail.internet.MimeMessage resultMessage = mailSender.createMessageWithHTMLCode(resultingHtml.toString(), subject, recipients);
    try {
        mailSender.sendMessage(resultMessage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
