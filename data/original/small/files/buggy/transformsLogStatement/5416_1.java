@java.lang.Override
public boolean supportsDevModeInJunit(com.google.gwt.core.ext.LinkerContext context) {
    System.out.println("log");
    return (getHostedFilename()) != "";
}
