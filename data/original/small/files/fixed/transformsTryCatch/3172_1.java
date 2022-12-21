private void setValue(int value) {
    try {
        validateValue(value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.value = value;
}
