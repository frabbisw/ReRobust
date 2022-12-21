@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    System.out.println("log");
    if (requestCode == 100) {
        if (requestCode == (RESULT_OK)) {
            iv_takeImage.setImageURI(file);
        }
    }
}
