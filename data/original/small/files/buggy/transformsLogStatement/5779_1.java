public java.lang.String getNextUrl() {
    System.out.println("log");
    return apiResponse.getLinks().get("next").getHref();
}
