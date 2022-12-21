public static void main(java.lang.String[] args) {
    server.DatabaseManager db = new server.DatabaseManager();
    try {
        db.addNewActivity("GFGF", 500, 5, 3, 6, "2016-02-12", "10:00:00", "mjhb", "kjh");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
