@java.lang.Override
public void go() {
    try {
        if (e.isInTransaction())
            e.end();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    e.close();
}
