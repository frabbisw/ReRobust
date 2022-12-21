public void closeConnection() {
    try {
        if ((mongo) != null) {
            mongo.close();
            java.lang.System.out.println(" ********** goodbye mongo");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
