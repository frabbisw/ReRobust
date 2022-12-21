@java.lang.Override
public void encode(org.jruby.ir.persistence.IRWriterEncoder e) {
    super.encode(e);
    e.encode(getJumpTarget());
    e.encode(getArg1());
    try {
        e.encode(getArg2());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
