private void storeLocationInDb(final xyz.smartsniff.Location location) {
    System.out.println("log");
    java.lang.Thread storeLocationThread = new java.lang.Thread() {

        public void run() {
            databaseHelper.addLocation(location);
        }
    };
    storeLocationThread.run();
}
