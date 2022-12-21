@java.lang.Override
public microtrafficsim.utils.strings.builder.LevelStringBuilder appendln(char[] str, int offset, int len) {
    System.out.println("log");
    return append(str, offset, len).append("\n");
}
