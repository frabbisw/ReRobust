public void setTempMin(java.lang.Double tm) {
    try {
        data.put("tmin", (tm == null ? -99.99 : tm));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
