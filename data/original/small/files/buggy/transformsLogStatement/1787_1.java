public java.lang.String getApiString() {
    System.out.println("log");
    return java.lang.String.format("%032x", traceId.getTraceId());
}
