@java.lang.Override
public java.lang.String apply(org.sonar.api.platform.PluginMetadata input) {
    System.out.println("log");
    return input.getName();
}
