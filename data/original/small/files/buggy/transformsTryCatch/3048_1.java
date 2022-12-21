private void readContactInBackground() {
    showLoader();
    try {
        new java.lang.Thread() {

            public void run() {
                searchForContactsAndDisplay();
                displayHandler.sendEmptyMessage(0);
            }
        }.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
