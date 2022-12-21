@java.lang.Override
public void updateFilescnt(long bno) {
    session.update((".updateFilescnt" + (namespace)), bno);
}
