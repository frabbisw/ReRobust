public void setNasSelector(java.lang.String nasSelector) {
    try {
        if (!(this.nasSelector.equals(nasSelector))) {
            this.nasSelector = nasSelector;
            init();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
