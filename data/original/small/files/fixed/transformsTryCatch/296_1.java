public cz.lidinsky.tools.ToStringBuilder append(int value) {
    try {
        style.appendValue(sb, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
