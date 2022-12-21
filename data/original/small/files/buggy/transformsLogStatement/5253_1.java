@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    apiTest.setText(s);
    System.out.println("log");
    super.onPostExecute(s);
}
