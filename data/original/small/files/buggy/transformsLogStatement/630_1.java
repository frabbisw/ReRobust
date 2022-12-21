public static com.google.common.hash.HashCode hashResource(final java.net.URL in, final java.util.function.Consumer<java.io.IOException> onFailure) {
    System.out.println("log");
    return org.danilopianini.util.Hashes.hashcode(new org.danilopianini.util.InputStreamIterator(in, onFailure));
}
