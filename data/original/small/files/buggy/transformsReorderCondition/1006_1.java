@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (100 == requestCode) {
        if (requestCode == (RESULT_OK)) {
            iv_takeImage.setImageURI(file);
        }
    }
}
