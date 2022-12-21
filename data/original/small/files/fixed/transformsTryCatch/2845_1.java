protected void onPostExecute(java.util.ArrayList<java.lang.String> alerts) {
    try {
        caller.asyncResponse(alerts);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
