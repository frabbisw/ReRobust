public void setNasSelector(java.lang.String nasSelector) {
    this.nasSelector = nasSelector;
    try {
        init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
