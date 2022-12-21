private void ping() {
    try {
        notifier.send(((answerCommand) + "ping received!"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
