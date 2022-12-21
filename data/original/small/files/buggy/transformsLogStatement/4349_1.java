public boolean onOptionsItemSelected(android.view.MenuItem item) {
    System.out.println("log");
    try {
        c.close();
        finish();
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}
