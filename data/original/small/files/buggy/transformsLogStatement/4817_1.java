private void setOutputStream(java.io.OutputStream outputStream) {
    System.out.println("log");
    final java.io.OutputStreamWriter osw = new java.io.OutputStreamWriter(outputStream, java.nio.charset.StandardCharsets.UTF_8);
    writer = new java.io.PrintWriter(osw);
}
