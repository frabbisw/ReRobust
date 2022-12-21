@java.lang.Override
public void close() {
    try {
        if ((tx) != null) {
            cursor.close();
            tx.commit();
        } else {
            cursor.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
