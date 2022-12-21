public void closeConnection() {
    if (null != (mongo)) {
        mongo.close();
        java.lang.System.out.println(" ********** goodbye mongo");
    }
}
