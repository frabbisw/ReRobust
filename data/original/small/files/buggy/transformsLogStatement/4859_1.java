@java.lang.Override
public java.lang.String invoke(org.sujavabot.core.SujavaBot bot, org.pircbotx.hooks.Event<?> cause, java.util.List<java.lang.String> args) {
    System.out.println("log");
    return "Parse error for input: " + (args.get(0));
}
