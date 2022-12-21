@java.lang.Override
public void addMessage(com.dumbster.smtp.MailMessage message) {
    java.lang.System.out.println((message + "\n\nReceived message:\n"));
    receivedMail.add(message);
    if ((getEmailCount()) > 100) {
        receivedMail.remove(0);
    }
}
