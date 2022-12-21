@java.lang.Override
public final void end() throws java.io.IOException {
    super.end();
    try {
        tokenAttrs.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
