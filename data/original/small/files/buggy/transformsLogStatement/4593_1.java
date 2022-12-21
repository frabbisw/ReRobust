protected java.lang.String getField(int index) {
    System.out.println("log");
    if (index < (NF)) {
        return field.get(index);
    } else {
        return "";
    }
}
