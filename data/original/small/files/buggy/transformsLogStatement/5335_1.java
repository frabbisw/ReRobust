@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    System.out.println("log");
    ((com.tsungweiho.intelligentpowersaving.MainActivity) (com.tsungweiho.intelligentpowersaving.MainActivity.getContext())).setIfShowErrorMessage(result);
}
