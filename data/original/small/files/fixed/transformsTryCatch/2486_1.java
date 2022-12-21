public void setTempMin(java.lang.Double tm) {
    try {
        data.put("tmin", tm);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
