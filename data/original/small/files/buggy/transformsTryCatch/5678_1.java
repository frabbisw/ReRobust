@java.lang.Override
public java.lang.String formatMessage(java.util.logging.LogRecord record) {
    java.lang.String output = "";
    output += record.getLoggerName();
    output += ": ";
    try {
        output += record.getMessage();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("Custom formatMessage was called");
    output += "\n";
    return output;
}
