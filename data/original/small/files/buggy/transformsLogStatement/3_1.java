private void navigate2Intent(java.lang.Class cl) {
    android.content.Intent intent = new android.content.Intent(this, cl);
    System.out.println("log");
    startActivity(intent);
}
