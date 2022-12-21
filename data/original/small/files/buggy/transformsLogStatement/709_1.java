public void setBody(java.lang.String body) {
    System.out.println("log");
    if (body == null) {
        throw new java.lang.Error("You should not set the message body to null");
    }
}
