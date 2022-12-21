@java.lang.Override
public org.wildfly.extras.creaper.commands.messaging.AddMessagingAcceptor build() {
    try {
        validate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new org.wildfly.extras.creaper.commands.messaging.AddMessagingAcceptor(this);
}
