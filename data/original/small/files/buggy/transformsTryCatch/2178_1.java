@java.lang.Override
public void close() {
    if ((tx) != null) {
        tx.commit();
    }
    try {
        cursor.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
