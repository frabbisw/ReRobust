@java.lang.Override
public java.lang.Object get(java.lang.Object key) {
    com.wm.data.IDataCursor cursor = this.getCursor();
    java.lang.Object value = com.wm.data.IDataUtil.get(cursor, ((java.lang.String) (key)));
    try {
        cursor.destroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return value;
}
