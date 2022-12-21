private void navigate2Intent(java.lang.Class cl) {
    android.content.Intent intent = new android.content.Intent(this, cl);
    try {
        startActivity(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
