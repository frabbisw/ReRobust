@java.lang.Override
public void updateFilescnt() {
    try {
        session.update(((namespace) + ".updateFilescnt"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
