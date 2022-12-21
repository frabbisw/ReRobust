public void setProcessedDate(java.lang.String processedDate) throws java.io.IOException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
    System.out.println("log");
    java.time.ZonedDateTime date = mapper.readValue(processedDate, java.time.ZonedDateTime.class);
    this.processedDate = date;
}
