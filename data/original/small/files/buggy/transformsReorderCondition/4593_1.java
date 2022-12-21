protected java.lang.String getField(int index) {
    if ((NF) > index) {
        return field.get(index);
    } else {
        return "";
    }
}
