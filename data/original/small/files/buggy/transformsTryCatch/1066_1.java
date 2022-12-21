@java.lang.Override
public java.lang.Object visitFail(nez.lang.Nez.Fail e, java.lang.Object a) {
    try {
        trace("F");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    Fail();
    return null;
}
