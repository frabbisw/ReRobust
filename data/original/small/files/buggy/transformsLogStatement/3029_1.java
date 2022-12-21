public java.lang.String listen() throws java.io.IOException {
    System.out.println("log");
    while (true) {
        java.lang.String message = in.readLine();
        if (message.startsWith("MOVE"))
            return message;
    }
}
