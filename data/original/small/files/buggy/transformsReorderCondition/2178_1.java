@java.lang.Override
public void close() {
    if (null != (tx)) {
        tx.commit();
    }
    cursor.close();
}
