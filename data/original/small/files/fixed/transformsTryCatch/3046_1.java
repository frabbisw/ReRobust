public java.math.BigDecimal getValue() {
    try {
        if (this.getText().isEmpty())
            return null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new java.math.BigDecimal(this.getText());
}
