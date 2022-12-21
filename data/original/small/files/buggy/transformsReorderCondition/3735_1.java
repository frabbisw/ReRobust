@java.lang.Override
public java.lang.String status() {
    return (lastMessage) + (((("Delay: " + (config.getDelay())) + ", next execution: ") + (messenger.getNextExecutionTime())) + ", next message to be send: ");
}
