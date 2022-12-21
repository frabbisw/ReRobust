public java.lang.String listen() throws java.io.IOException {
    for (; true; ) {
        java.lang.String message = in.readLine();
        if (message.startsWith("MOVE"))
            return message;
    }
}
