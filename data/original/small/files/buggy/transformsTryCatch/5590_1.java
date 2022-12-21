public java.util.Date getDate(java.sql.Timestamp timestamp) {
    LOGGER.debug("getting date for {}", timestamp);
    try {
        if (timestamp != null)
            return new java.util.Date(timestamp.getTime());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
