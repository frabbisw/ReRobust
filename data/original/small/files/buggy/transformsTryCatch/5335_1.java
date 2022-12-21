@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    try {
        ((com.tsungweiho.intelligentpowersaving.MainActivity) (com.tsungweiho.intelligentpowersaving.MainActivity.getContext())).setIfShowErrorMessage(result);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
