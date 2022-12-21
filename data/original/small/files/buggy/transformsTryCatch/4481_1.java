@java.lang.Override
public final void end() throws java.io.IOException {
    try {
        super.end();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    clearAttributes();
    tokenAttrs.clear();
}
