protected java.lang.String getField(int index) {
    try {
        if (index <= (NF)) {
            return field.get(index);
        } else {
            return "";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
