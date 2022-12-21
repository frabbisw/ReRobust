public boolean isExternalStorageReadable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    try {
        if ((Environment.MEDIA_MOUNTED.equals(state)) || (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state))) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
