private java.lang.String getPrettyJson(java.lang.String json) {
    System.out.println("log");
    return (json != null) && (!(json.isEmpty())) ? gson.toJson(jsonParser.parse(json)) : "";
}
