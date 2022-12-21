@java.lang.Override
public void addMessage(com.dumbster.smtp.MailMessage message) {
    java.lang.System.out.println(("\n\nReceived message:\n" + message));
    System.out.println("log");
    receivedMail.add(message);
    if ((getEmailCount()) > 100) {
        receivedMail.remove(0);
    }
}
