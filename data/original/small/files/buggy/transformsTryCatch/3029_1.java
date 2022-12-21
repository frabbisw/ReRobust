public java.lang.String listen() throws java.io.IOException {
    try {
        while (true) {
            java.lang.String message = in.readLine();
            if (message.startsWith("MOVE"))
                return message;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
