public boolean isExternalStorageReadable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if ((Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) || (Environment.MEDIA_MOUNTED.equals(state))) {
        return true;
    }
    return false;
}
