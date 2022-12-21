public sneer.flux.Action sendMessage(java.lang.String text) {
    System.out.println("log");
    return sneer.flux.Action.action("send-message", "contact-id", id, "text", text);
}
