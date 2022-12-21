public void setProcessedDate(java.lang.String processedDate) throws java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.time.ZonedDateTime date = mapper.readValue(processedDate, java.time.ZonedDateTime.class);
    this.processedDate = date;
}
