public boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    try {
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
