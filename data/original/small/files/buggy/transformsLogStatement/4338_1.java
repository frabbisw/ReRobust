public void closeConnection() {
    System.out.println("log");
    if ((mongo) != null) {
        mongo.close();
        java.lang.System.out.println(" ********** goodbye mongo");
    }
}
