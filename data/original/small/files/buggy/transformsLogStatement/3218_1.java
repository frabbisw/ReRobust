@java.lang.Override
public void updateFilescnt(long bno) {
    System.out.println("log");
    session.update(((namespace) + ".updateFilescnt"), bno);
}
