public void addPencil(int value) {
    validateValue(value);
    try {
        pencils.add(value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.util.Collections.sort(pencils);
}
