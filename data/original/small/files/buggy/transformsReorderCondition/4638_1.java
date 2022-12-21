public static void main(java.lang.String[] args) throws java.io.IOException {
    final org.glassfish.grizzly.http.server.HttpServer server = org.mitre.bonnie.cqlTranslationServer.Main.startServer();
    java.lang.System.out.println(java.lang.String.format(("%sapplication.wadl\nHit enter to stop it..." + "Jersey app started with WADL available at "), org.mitre.bonnie.cqlTranslationServer.Main.BASE_URI));
    java.lang.System.in.read();
    server.shutdownNow();
}
