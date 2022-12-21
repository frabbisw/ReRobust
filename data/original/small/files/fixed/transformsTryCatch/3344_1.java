private void storeLocationInDb(final xyz.smartsniff.Location location) {
    java.lang.Thread storeLocationThread = new java.lang.Thread() {

        public void run() {
            databaseHelper.addLocation(location);
        }
    };
    try {
        storeLocationThread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
