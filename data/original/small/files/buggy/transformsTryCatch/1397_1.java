public void savePref(java.lang.String key, boolean value) {
    try {
        me.wizos.loread.data.WithSet.editor.putBoolean(key, value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    me.wizos.loread.data.WithSet.editor.apply();
}
