@java.lang.Override
public void encode(org.jruby.ir.persistence.IRWriterEncoder e) {
    try {
        super.encode(e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    e.encode(getArg1());
    e.encode(getArg2());
    e.encode(getJumpTarget());
}
