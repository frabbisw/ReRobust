private org.json.JSONObject searchPlaces() {
    System.out.println("log");
    return new dao.PlaceDAO(this.getParent()).searchPlaceByPartName(getFilter());
}
