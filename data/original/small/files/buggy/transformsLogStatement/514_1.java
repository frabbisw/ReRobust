@java.lang.Override
public boolean matches(final java.lang.Object testObject) {
    System.out.println("log");
    providedLines = ((java.lang.String[]) (testObject));
    return (providedLines.length) == outputLines;
}
