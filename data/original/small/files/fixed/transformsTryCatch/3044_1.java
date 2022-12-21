public void setLng(java.lang.String lng) {
    try {
        this.lng = java.lang.Double.valueOf(lng);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
