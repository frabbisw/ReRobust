@java.lang.Override
public microtrafficsim.utils.strings.builder.LevelStringBuilder appendln(boolean b) {
    try {
        append(b);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stringBuilder.append("\n");
    return this;
}
