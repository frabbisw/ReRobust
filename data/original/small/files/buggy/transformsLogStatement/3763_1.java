public static net.straylightlabs.tivolibre.PesHeader createFrom(java.nio.ByteBuffer buffer) {
    System.out.println("log");
    return new net.straylightlabs.tivolibre.PesHeader(buffer, null);
}
