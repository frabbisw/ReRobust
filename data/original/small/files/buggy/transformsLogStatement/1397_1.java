public void savePref(java.lang.String key, boolean value) {
    System.out.println("log");
    me.wizos.loread.data.WithSet.editor.putBoolean(key, value);
    me.wizos.loread.data.WithSet.editor.apply();
}
