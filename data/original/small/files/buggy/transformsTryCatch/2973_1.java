@java.lang.Override
public void addMessage(com.dumbster.smtp.MailMessage message) {
    java.lang.System.out.println(("\n\nReceived message:\n" + message));
    try {
        receivedMail.add(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((getEmailCount()) > 100) {
        receivedMail.remove(0);
    }
}
