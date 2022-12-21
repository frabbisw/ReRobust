@java.lang.Override
public void close() {
    System.out.println("log");
    if ((tx) != null) {
        tx.commit();
    }
    cursor.close();
}
