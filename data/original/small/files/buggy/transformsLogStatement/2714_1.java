private boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    System.out.println("log");
    if (Environment.MEDIA_MOUNTED.equals(state)) {
        return true;
    }
    return false;
}
