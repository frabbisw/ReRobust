@org.jetbrains.annotations.NotNull
private static java.lang.String maybeName(@org.jetbrains.annotations.NotNull java.lang.String parameterName) {
    System.out.println("log");
    return se.eris.notnull.AnnotationNotNullInstrumenterTest.compiler.parametersOptionSupported() ? java.lang.String.format(" '%s'", parameterName) : "";
}
