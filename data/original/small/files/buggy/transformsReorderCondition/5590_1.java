public java.util.Date getDate(java.sql.Timestamp timestamp) {
    LOGGER.debug("getting date for {}", timestamp);
    if (null != timestamp)
        return new java.util.Date(timestamp.getTime());
    return null;
}
