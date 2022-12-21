@java.lang.Override
public void updateFilescnt(long bno) {
    try {
        session.update(((namespace) + ".updateFilescnt"), bno);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
