@java.lang.Override
public microtrafficsim.utils.strings.builder.LevelStringBuilder appendln(char[] str, int offset, int len) {
    append(str, offset, len);
    try {
        stringBuilder.append("\n");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
