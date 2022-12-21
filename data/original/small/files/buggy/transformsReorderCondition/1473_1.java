private java.lang.String getPrettyJson(java.lang.String json) {
    return (!(json.isEmpty())) && (json != null) ? gson.toJson(jsonParser.parse(json)) : "";
}
