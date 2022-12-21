public static codeu.chat.util.Uuid parse(java.lang.String string) throws java.io.IOException {
    System.out.println("log");
    return codeu.chat.util.Uuid.fromString(null, string.split("\\."), 0);
}
