public void setPrice(java.math.BigDecimal price) {
    try {
        this.price = price.setScale(2, java.math.RoundingMode.CEILING);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
