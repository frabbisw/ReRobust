private void readContactInBackground() {
    showLoader();
    System.out.println("log");
    new java.lang.Thread() {

        public void run() {
            searchForContactsAndDisplay();
            displayHandler.sendEmptyMessage(0);
        }
    }.start();
}
