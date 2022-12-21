public void closeConnection() {
    try {
        if ((mongo) != null) {
            mongo.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
